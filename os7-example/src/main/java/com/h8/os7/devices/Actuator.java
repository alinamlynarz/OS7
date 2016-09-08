package com.h8.os7.devices;

import com.h8.os7.core.common.annotation.component.Component;
import com.h8.os7.core.common.annotation.dependency.Runner;
import lombok.Getter;
import lombok.Setter;

@Component("actuatorHandler")
public class Actuator {
    @Setter
    @Getter
    private boolean interlock;

    private Mode mode;

    private ActuatorInterface i;

    public Actuator(ActuatorInterface i) {
        this.i = i;
    }

    public void moveForward() {
        mode = Mode.FORWARD;
    }

    public void moveBackward() {
        mode = Mode.BACKWARD;
    }

    public void stop() {
        mode = Mode.STOP;
    }

    @Runner
    public void run() {
        handleActuatorMovement();
    }

    private void handleActuatorMovement() {
        i.getBackwardMovement().set(false);
        i.getForwardMovement().set(false);

        switch (mode) {
            case FORWARD:
                if (!i.getMaxPosition().isSet()) {
                    i.getForwardMovement().set(true);
                }
                break;
            case BACKWARD:
                if (!i.getMinPosition().isSet()) {
                    i.getBackwardMovement().set(true);
                }
                break;
            default:
                break;
        }
    }

    private enum Mode {
        FORWARD,
        BACKWARD,
        STOP
    }
}

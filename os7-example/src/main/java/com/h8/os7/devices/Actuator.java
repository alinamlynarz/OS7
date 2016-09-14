package com.h8.os7.devices;

import com.h8.os7.core.annotations.components.structure.Component;
import com.h8.os7.core.annotations.dependency.Injectable;
import com.h8.os7.core.annotations.dependency.Runner;
import com.h8.os7.core.types.RunnerType;
import lombok.Setter;

@Component("actuatorHandler")
public class Actuator {
    @Setter
    private boolean interlock;

    private Mode mode;

    @Injectable
    private ActuatorInterface i;

    public void moveForward() {
        mode = Mode.FORWARD;
    }

    public void moveBackward() {
        mode = Mode.BACKWARD;
    }

    public void stop() {
        mode = Mode.STOP;
    }

    @Runner(RunnerType.OB1)
    public void run() {
        handleActuatorMovement();
    }

    private void handleActuatorMovement() {
        i.getBackwardMovement().set(false);
        i.getForwardMovement().set(false);

        if (!interlock) {
            handleActuatorMode();
        }
    }

    private void handleActuatorMode() {
        switch (mode) {
            case FORWARD:
                if (!i.getMaxPosition().get()) {
                    i.getForwardMovement().set(true);
                }
                break;
            case BACKWARD:
                if (!i.getMinPosition().get()) {
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

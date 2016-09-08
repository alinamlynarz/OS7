package com.h8.os7.controllers;

import com.h8.os7.core.common.annotation.component.Controller;
import com.h8.os7.core.common.annotation.dependency.Runner;
import com.h8.os7.core.common.annotation.dependency.Use;
import com.h8.os7.interfaces.ActuatorInterface;
import com.h8.os7.interfaces.ControlDeskInterface;

@Controller("actuatorController")
public class ActuatorController {
    @Use
    ActuatorInterface actuatorInterface;

    @Use
    ControlDeskInterface controlDeskInterface;

    Integer runMode;

    @Runner
    public void run() {
        handleModeSelection();
        handleActuatorMovement();
    }

    private void handleModeSelection() {
        runMode = controlDeskInterface.getStopButton().isSet() ? 0
                : (controlDeskInterface.getForwardButton().isSet() ? 1
                    : (controlDeskInterface.getBackwardButton().isSet() ? 2
                        : runMode));
    }

    private void handleActuatorMovement() {
        actuatorInterface.getBackwardMovement().set(false);
        actuatorInterface.getForwardMovement().set(false);

        switch (runMode) {
            case 1:
                if (!actuatorInterface.getMaxPosition().isSet()) {
                    actuatorInterface.getForwardMovement().set(true);
                }
                break;
            case 2:
                if (!actuatorInterface.getMinPosition().isSet()) {
                    actuatorInterface.getBackwardMovement().set(true);
                }
                break;
            default:
                break;
        }
    }
}

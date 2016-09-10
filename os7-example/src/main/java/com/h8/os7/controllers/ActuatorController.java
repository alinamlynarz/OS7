package com.h8.os7.controllers;

import com.h8.os7.core.common.annotation.component.Controller;
import com.h8.os7.core.common.annotation.dependency.Create;
import com.h8.os7.core.common.annotation.dependency.Runner;
import com.h8.os7.core.common.annotation.dependency.Use;
import com.h8.os7.devices.Actuator;
import com.h8.os7.interfaces.ExampleActuatorInterface;
import com.h8.os7.interfaces.ExampleControlDeskInterface;

@Controller("actuatorController")
public class ActuatorController {
    @Use
    ExampleActuatorInterface exampleActuatorInterface;

    @Use
    ExampleControlDeskInterface exampleControlDeskInterface;

    @Create
    Actuator actuator = new Actuator(exampleActuatorInterface);

    @Runner
    public void run() {
        handleExampleActuator();
    }

    private void handleExampleActuator() {
        actuator.setInterlock(exampleActuatorInterface.getMovementLocked().isSet());

        if (exampleControlDeskInterface.getForwardButton().isSet()) {
            actuator.moveForward();
        }
        if (exampleControlDeskInterface.getBackwardButton().isSet()) {
            actuator.moveBackward();
        }
        if (exampleControlDeskInterface.getStopButton().isSet()) {
            actuator.stop();
        }
    }
}

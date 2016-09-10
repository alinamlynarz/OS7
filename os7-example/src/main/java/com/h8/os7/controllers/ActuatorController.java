package com.h8.os7.controllers;

import com.h8.os7.core.common.annotation.component.Controller;
import com.h8.os7.core.common.annotation.dependency.Instantiate;
import com.h8.os7.core.common.annotation.dependency.Runner;
import com.h8.os7.core.common.annotation.dependency.Use;
import com.h8.os7.core.common.types.RunnerType;
import com.h8.os7.devices.Actuator;
import com.h8.os7.interfaces.ExampleActuatorInterface;
import com.h8.os7.interfaces.ExampleControlDeskInterface;

@Controller("actuatorController")
public class ActuatorController {
    @Use
    ExampleActuatorInterface exampleActuatorInterface;

    @Use
    ExampleControlDeskInterface exampleControlDeskInterface;

    @Instantiate
    Actuator actuator = new Actuator(exampleActuatorInterface);

    @Runner(RunnerType.OB1)
    public void run() {
        handleExampleActuator();
    }

    private void handleExampleActuator() {
        actuator.setInterlock(exampleActuatorInterface.getMovementLocked().get());

        if (exampleControlDeskInterface.getForwardButton().get()) {
            actuator.moveForward();
        }
        if (exampleControlDeskInterface.getBackwardButton().get()) {
            actuator.moveBackward();
        }
        if (exampleControlDeskInterface.getStopButton().get()) {
            actuator.stop();
        }
    }
}

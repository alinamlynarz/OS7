package com.h8.os7.controllers;

import com.h8.os7.core.common.annotation.component.Controller;
import com.h8.os7.core.common.annotation.dependency.Runner;
import com.h8.os7.core.common.annotation.dependency.Use;
import com.h8.os7.interfaces.ExampleTankLevelInterface;

@Controller("tankController")
public class TankController {
    private static final int WARNING_LEVEL = 100;
    private static final int ALARM_LEVEL = 120;

    @Use
    ExampleTankLevelInterface exampleTankLevelInterface;

    @Runner
    public void run() {
        handleTankIndication();
    }

    private void handleTankIndication() {
        boolean warningLevelReached = exampleTankLevelInterface.getLevelSensor().getValue() > WARNING_LEVEL;
        exampleTankLevelInterface.getYellowLevelLamp().set(warningLevelReached);

        boolean alarmLevelReached = exampleTankLevelInterface.getLevelSensor().getValue() > ALARM_LEVEL;
        exampleTankLevelInterface.getRedLevelLamp().set(alarmLevelReached);
    }
}

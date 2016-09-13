package com.h8.os7.devices;

import com.h8.os7.components.input.impl.BooleanInput;
import com.h8.os7.components.output.impl.BooleanOutput;

public interface ActuatorInterface {
    BooleanInput getMinPosition();

    BooleanInput getMaxPosition();

    BooleanOutput getBackwardMovement();

    BooleanOutput getForwardMovement();
}

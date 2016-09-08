package com.h8.os7.devices;

import com.h8.os7.core.input.impl.BooleanInput;
import com.h8.os7.core.output.impl.BooleanOutput;

public interface ActuatorInterface {
    BooleanInput getMinPosition();

    BooleanInput getMaxPosition();

    BooleanOutput getBackwardMovement();

    BooleanOutput getForwardMovement();
}

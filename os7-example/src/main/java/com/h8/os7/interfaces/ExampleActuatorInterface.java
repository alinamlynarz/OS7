package com.h8.os7.interfaces;

import com.h8.os7.core.common.annotation.address.Address;
import com.h8.os7.core.common.annotation.component.Interface;
import com.h8.os7.core.input.annotation.Input;
import com.h8.os7.core.input.impl.BooleanInput;
import com.h8.os7.core.input.type.InputType;
import com.h8.os7.core.output.annotation.Output;
import com.h8.os7.core.output.impl.BooleanOutput;
import com.h8.os7.core.output.type.OutputType;
import com.h8.os7.devices.ActuatorInterface;
import lombok.Getter;

@Interface("exampleActuatorInterface")
public class ExampleActuatorInterface implements ActuatorInterface {
    @Getter
    @Input(type = InputType.I, address = @Address(10.0))
    private BooleanInput minPosition;

    @Getter
    @Input(type = InputType.I, address = @Address(10.1))
    private BooleanInput maxPosition;

    @Getter
    @Input(type = InputType.I, address = @Address(10.2))
    private BooleanInput movementLocked;

    @Getter
    @Output(type = OutputType.A, address = @Address(10.0))
    private BooleanOutput forwardMovement;

    @Getter
    @Output(type = OutputType.A, address = @Address(10.1))
    private BooleanOutput backwardMovement;
}

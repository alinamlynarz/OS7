package com.h8.os7.interfaces;

import com.h8.os7.core.common.annotation.component.Interface;
import com.h8.os7.core.common.annotation.address.BitAddress;
import com.h8.os7.core.input.annotation.Input;
import com.h8.os7.core.input.impl.BooleanInput;
import com.h8.os7.core.input.type.InputType;
import com.h8.os7.core.output.annotation.Output;
import com.h8.os7.core.output.impl.BooleanOutput;
import com.h8.os7.core.output.type.OutputType;
import lombok.Getter;

@Interface("actuatorInterface")
public class ActuatorInterface {
    @Input(type = InputType.I, address = @BitAddress(10.0))
    @Getter
    private BooleanInput minPosition;

    @Input(type = InputType.I, address = @BitAddress(10.1))
    @Getter
    private BooleanInput maxPosition;

    @Output(type = OutputType.A, address = @BitAddress(10.0))
    @Getter
    private BooleanOutput forwardMovement;

    @Output(type = OutputType.A, address = @BitAddress(10.1))
    @Getter
    private BooleanOutput backwardMovement;
}

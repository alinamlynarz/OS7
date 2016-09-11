package com.h8.os7.interfaces;

import com.h8.os7.core.common.annotation.address.Address;
import com.h8.os7.core.input.annotation.Input;
import com.h8.os7.core.input.impl.WordInput;
import com.h8.os7.core.input.type.InputType;
import com.h8.os7.core.output.annotation.Output;
import com.h8.os7.core.output.impl.BooleanOutput;
import com.h8.os7.core.output.type.OutputType;
import lombok.Getter;

public class ExampleTankLevelInterface {
    @Getter
    @Input(type = InputType.I, address = @Address(22))
    private WordInput levelSensor;

    @Getter
    @Output(type = OutputType.A, address = @Address(20.0))
    private BooleanOutput yellowLevelLamp;


    @Getter
    @Output(type = OutputType.A, address = @Address(20.1))
    private BooleanOutput redLevelLamp;
}

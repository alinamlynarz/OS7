package com.h8.os7.interfaces;

import com.h8.os7.core.common.annotation.address.BitAddress;
import com.h8.os7.core.common.annotation.address.WordAddress;
import com.h8.os7.core.input.annotation.Input;
import com.h8.os7.core.input.impl.WordInput;
import com.h8.os7.core.input.type.InputType;
import com.h8.os7.core.output.annotation.Output;
import com.h8.os7.core.output.impl.BooleanOutput;
import com.h8.os7.core.output.type.OutputType;
import lombok.Getter;

public class ExampleTankLevelInterface {
    @Input(type = InputType.I, wordAddress = @WordAddress(22))
    @Getter
    WordInput levelSensor;

    @Output(type = OutputType.A, bitAddress = @BitAddress(20.0))
    @Getter
    BooleanOutput yellowLevelLamp;


    @Output(type = OutputType.A, bitAddress = @BitAddress(20.1))
    @Getter
    BooleanOutput redLevelLamp;
}

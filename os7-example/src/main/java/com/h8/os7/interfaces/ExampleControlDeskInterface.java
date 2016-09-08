package com.h8.os7.interfaces;

import com.h8.os7.core.common.annotation.address.BitAddress;
import com.h8.os7.core.common.annotation.component.Interface;
import com.h8.os7.core.input.annotation.Input;
import com.h8.os7.core.input.impl.BooleanInput;
import com.h8.os7.core.input.type.InputType;
import lombok.Getter;

@Interface("controlDeskInterface")
public class ExampleControlDeskInterface {
    @Input(type = InputType.I, address = @BitAddress(12.0))
    @Getter
    private BooleanInput forwardButton;

    @Input(type = InputType.I, address = @BitAddress(12.0))
    @Getter
    private BooleanInput backwardButton;

    @Input(type = InputType.I, address = @BitAddress(12.1))
    @Getter
    private BooleanInput stopButton;
}

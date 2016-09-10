package com.h8.os7.interfaces;

import com.h8.os7.core.common.annotation.address.Address;
import com.h8.os7.core.common.annotation.component.Interface;
import com.h8.os7.core.input.annotation.Input;
import com.h8.os7.core.input.impl.BooleanInput;
import com.h8.os7.core.input.type.InputType;
import lombok.Getter;

@Interface("controlDeskInterface")
public class ExampleControlDeskInterface {
    @Getter
    @Input(type = InputType.I, address = @Address(12.0))
    private BooleanInput forwardButton;

    @Getter
    @Input(type = InputType.I, address = @Address(12.0))
    private BooleanInput backwardButton;

    @Getter
    @Input(type = InputType.I, address = @Address(12.1))
    private BooleanInput stopButton;
}

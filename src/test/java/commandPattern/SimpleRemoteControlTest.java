package commandPattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SimpleRemoteControlTest {
    @Test
    public void buttonPressTest() {
        // given
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new LightImpl();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);

        //when
        String result = simpleRemoteControl.buttonWasPressed();

        //then
        assertThat(result).isEqualTo("Light is ON!");

    }
}
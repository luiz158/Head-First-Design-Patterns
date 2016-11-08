package headfirst.designpatterns.command.simpleremote.client;

import headfirst.designpatterns.command.simpleremote.invoker.SimpleRemoteControl;
import headfirst.designpatterns.command.simpleremote.command.GarageDoorOpenCommand;
import headfirst.designpatterns.command.simpleremote.command.LightOnCommand;
import headfirst.designpatterns.command.simpleremote.recevior.GarageDoor;
import headfirst.designpatterns.command.simpleremote.recevior.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl invoker = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        invoker.setCommand(lightOn);
        invoker.buttonWasPressed();
        invoker.setCommand(garageOpen);
        invoker.buttonWasPressed();
    }

}

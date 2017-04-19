package headfirst.designpatterns.command.party;

public class LivingRoomLightOnCommand implements Command {
	Light light;

	public LivingRoomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}

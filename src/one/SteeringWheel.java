package one;

public class SteeringWheel extends CarPart implements Functional {
	private boolean hasPowerSteering;
	
	public void setPowerSteering() {
		if (this.hasPowerSteering == true) {
			this.hasPowerSteering = false;
		} else if (this.hasPowerSteering == false) {
			this.hasPowerSteering = true;
		}
	}
	
	public void function() {
		if (this.hasPowerSteering == true) {
			System.out.println("Power steering is good. This steering wheel is good to go!");
		} else {
			System.out.println("Having some problems with power steering. You better check that.");
		}
	}
	
	
}

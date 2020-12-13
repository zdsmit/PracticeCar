package one;

public class Engine extends CarPart implements Functional {
	private int cylinders;
	
	public void setCylinders(int cylinders) {
		if (cylinders == 4 || cylinders == 6 || cylinders == 8 || cylinders == 10 || cylinders ==  12) {
			this.cylinders = cylinders;
		} else {
			System.out.println("Please enter a valid number of engine cylinders (4, 6, 8, 10, or 12)");
		}
	}
	
	public void getCylinders() {
		System.out.println(this.cylinders);
	}
	
	public void function() {
		if (this.cylinders == 4) {
			System.out.println("Well, the engine is running, I guess.");
		} else if (this.cylinders == 6) {
			System.out.println("The engine is running.");
		} else if (this.cylinders == 8) {
			System.out.println("Man, this engine is really running.");
		} else if (this.cylinders == 10) {
			System.out.println("Wow, this engine is running like crazy!");
		} else if (this.cylinders == 12) {
			System.out.println("This engine is running out of control!");
		}
	}
	
}

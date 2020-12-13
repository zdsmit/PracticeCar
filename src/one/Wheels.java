package one;

public class Wheels extends CarPart implements Functional {
	private int numberOfWheels;
	
	public void setWheels(int wheels) {
		if (wheels >= 0 && wheels <= 4) {
			this.numberOfWheels = wheels;
		} else {
			System.out.println("Please enter a valid number of wheels (0-4)");
		}
	}
	
	public void getWheels() {
		System.out.println(this.numberOfWheels);
	}
	
	public void function() {
		if (this.numberOfWheels == 4) {
			System.out.println("The wheels are turning.");
		} else if (this.numberOfWheels == 3) {
			System.out.println("Looks like you're missing a wheel!");
		} else if (this.numberOfWheels == 2) {
			System.out.println("You're missing two wheels!");
		} else if (this.numberOfWheels == 1) {
			System.out.println("Bro, what are you doing? You've only got one wheel!");
		} else if (this.numberOfWheels == 0) {
			System.out.println("This car is going nowhere until you get some wheels.");
		}
	}
	
}

package one;

public class CarPart implements Functional {
	private int condition;
	
	public void function() {
		System.out.println("This is a functioning car part.");
	}
	
	public void setCondition(int condition) {
		if (condition >= 0 && condition <= 100) {
			this.condition = condition;
		} else {
			System.out.println("Please enter a value from 0-100");
		}
	}
	
	public void status() {
		System.out.println("The current integrity of this part is " + this.condition);
	}

}

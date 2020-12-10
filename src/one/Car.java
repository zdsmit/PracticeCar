package one;

public class Car {
	
	private Engine engine;
	private Wheels wheels;
	
	public Car(int cylinders, int numberOfWheels) {
		Engine engine = new Engine();
		Wheels wheels = new Wheels();
		
		this.engine = engine;
		this.wheels = wheels;
		
		engine.setCylinders(cylinders);
		wheels.setWheels(numberOfWheels);
	}
	
	public void run() {
		System.out.println("Starting up car now!");
		this.engine.function();
		this.wheels.function();
	}
}

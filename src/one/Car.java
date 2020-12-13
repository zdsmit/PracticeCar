package one;
import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	
	private Engine engine;
	private Wheels wheels;
	private ArrayList parts = new ArrayList();
	
	public Car(int cylinders, int numberOfWheels) { 
		Engine engine = new Engine();
		Wheels wheels = new Wheels();
		
		this.engine = engine;
		this.wheels = wheels;
		
		engine.setCylinders(cylinders);
		wheels.setWheels(numberOfWheels);
		
		this.parts.add(engine);
		this.parts.add(wheels);
	}
	
	public void run() {
		System.out.println("Starting up car now!");
		for (int i = 0; i < this.parts.size(); i++) {
			if (i == 0) {
				Engine engine = (Engine) this.parts.get(i);
				engine.function();
			} else if (i == 1) {
				Wheels wheels = (Wheels) this.parts.get(i);
				wheels.function();
			}
		}
	}
}



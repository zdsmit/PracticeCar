package one;
import java.util.*;

public class Car {
	
	private Engine engine;
	private Wheels wheels;
	private ArrayList parts;
	
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
		Iterator itr = this.parts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

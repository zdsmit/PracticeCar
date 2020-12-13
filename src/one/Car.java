package one;
import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	
	private Engine engine;
	private Wheels wheels;
	private ArrayList<Functional> parts = new ArrayList<Functional>();
	
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
			if (itr.next() instanceof Engine) {
				Engine engine = (Engine) itr.next();
				engine.function();
			} else if (itr.next() instanceof Wheels) {
				Wheels wheels = (Wheels) itr.next();
				wheels.function();
			}
		}
	}
}

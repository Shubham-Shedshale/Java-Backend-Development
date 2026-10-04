package jsp.springcore;

public class Car {
	
	Engine engine;
	
	public void start()
	{
		engine.run();
		System.out.println("Car is starting");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

}

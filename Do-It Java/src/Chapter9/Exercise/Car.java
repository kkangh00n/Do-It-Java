package Chapter9.Exercise;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar() {
		System.out.println("¡Ú¼¼Â÷¡Ú");
	}
	
	public final void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
	
}

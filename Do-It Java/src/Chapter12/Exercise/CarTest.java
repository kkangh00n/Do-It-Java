package Chapter12.Exercise;

import java.util.HashMap;

class Car{
	private String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
	
}

class CarFactory { //½ÌÅ¬Åæ ÆÐÅÏ
	private static CarFactory factory = new CarFactory();
	private CarFactory() {}
	HashMap<String, Car> carmap = new HashMap<>();
	
	public static CarFactory getInstance() {
		if (factory==null) {
			factory = new CarFactory();
		}
		return factory;
	}
	
	public Car createCar(String name) {
		if (carmap.containsKey(name)) {
			return carmap.get(name);
		}
		Car car = new Car(name);
		carmap.put(name, car);
		return car;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("¿¬¼ö Â÷");
		Car sonata2 = factory.createCar("¿¬¼ö Â÷");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = factory.createCar("½Â¿¬ Â÷");
		Car avante2 = factory.createCar("½Â¿¬ Â÷");
		System.out.println(sonata1 == sonata2);
		
		System.out.println(sonata1 == avante2);
		
		
	}

}

package Chapter13.stream.Exercise;

public class TravelCustomer implements Comparable<TravelCustomer> {

	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price){
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price; 
	}
	
	@Override
	public int compareTo(TravelCustomer o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}
}

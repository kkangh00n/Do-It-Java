package Chapter7.Exercise;

public class Dog {
	private String name;
	private String type;
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String gettype() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void settype(String type) {
		this.type = type;
	}
	public void showInfo() {
		System.out.println("이름 : " + this.name + "견종 : " + this.type);
	}
}

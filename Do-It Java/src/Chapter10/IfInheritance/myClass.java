package Chapter10.IfInheritance;

public class myClass implements myInterface {
	@Override
	public void One() {
		System.out.println("One()"); //one인터페이스에서 상속받은 메소드 구현
	}
	@Override
	public void Two() {
		System.out.println("Two()"); //two인터페이스에서 상속받은 메소드 구현
	}
	@Override
	public void myMethod() {
		System.out.println("myMethod()"); //myInterface의 메소드 구현
	}
	
}

package Chapter10.IfInheritance;

public class myClass implements myInterface {
	@Override
	public void One() {
		System.out.println("One()"); //one�������̽����� ��ӹ��� �޼ҵ� ����
	}
	@Override
	public void Two() {
		System.out.println("Two()"); //two�������̽����� ��ӹ��� �޼ҵ� ����
	}
	@Override
	public void myMethod() {
		System.out.println("myMethod()"); //myInterface�� �޼ҵ� ����
	}
	
}

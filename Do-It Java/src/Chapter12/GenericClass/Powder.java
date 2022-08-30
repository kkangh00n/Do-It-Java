package Chapter12.GenericClass;

public class Powder implements Material {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}
	public String toString() {
		return "재료는 Powder";
	}
}

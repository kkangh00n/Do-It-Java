package Chapter12.GenericClass;

public class Plastic implements Material {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
	public String toString() {
		return "재료는 Plastic";
	}
}

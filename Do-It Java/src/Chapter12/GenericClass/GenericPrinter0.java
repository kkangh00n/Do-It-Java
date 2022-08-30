package Chapter12.GenericClass;
//제네릭 클래스 1
public class GenericPrinter0<T> { //T는 컴파일 과정에서 Object형으로 변환 -> 12행
	private T material;
	
	GenericPrinter0 (T material) {
		this.material = material;
	}
	public T getMaterial() { //제네릭 메소드
		return material;
	}
	public String toString() { //그렇기 때문에 toString 재정의 가능!!
		return material.toString();
	}
}

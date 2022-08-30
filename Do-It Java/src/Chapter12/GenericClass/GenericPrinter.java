package Chapter12.GenericClass;
//제네릭 클래스
public class GenericPrinter<T extends Material> { //T는 Material 인터페이스를 구현한 클래스만 가능
	private T material;
	
	GenericPrinter (T material) {
		this.material = material;
	}
	public void setMaterial(T material) {
		material.doPrinting();
	}
	public T getMaterial() { //제네릭 메소드
		return material;
	}
	public String toString() { 
		return material.toString();
	}
	public void printing() {
		material.doPrinting(); //컴파일 과정에서 T가 Object가 아닌 Material 형으로 변환 => 따라서 material의 메소드 사용 가능
	}
}

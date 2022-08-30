package Chapter12.GenericClass;
//���׸� Ŭ����
public class GenericPrinter<T extends Material> { //T�� Material �������̽��� ������ Ŭ������ ����
	private T material;
	
	GenericPrinter (T material) {
		this.material = material;
	}
	public void setMaterial(T material) {
		material.doPrinting();
	}
	public T getMaterial() { //���׸� �޼ҵ�
		return material;
	}
	public String toString() { 
		return material.toString();
	}
	public void printing() {
		material.doPrinting(); //������ �������� T�� Object�� �ƴ� Material ������ ��ȯ => ���� material�� �޼ҵ� ��� ����
	}
}

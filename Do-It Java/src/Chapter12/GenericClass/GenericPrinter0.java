package Chapter12.GenericClass;
//���׸� Ŭ���� 1
public class GenericPrinter0<T> { //T�� ������ �������� Object������ ��ȯ -> 12��
	private T material;
	
	GenericPrinter0 (T material) {
		this.material = material;
	}
	public T getMaterial() { //���׸� �޼ҵ�
		return material;
	}
	public String toString() { //�׷��� ������ toString ������ ����!!
		return material.toString();
	}
}

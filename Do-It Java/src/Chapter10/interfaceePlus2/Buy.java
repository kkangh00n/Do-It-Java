package Chapter10.interfaceePlus2;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}

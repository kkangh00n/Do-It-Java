package Chapter10.interfaceePlus2;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}

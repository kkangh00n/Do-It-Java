package Chapter6.SingleTon;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon Company1 = SingleTon.getInstance();
		SingleTon Company2 = SingleTon.getInstance();
		
		System.out.println( Company1 == Company2 ); //������� 2���� �ν��Ͻ��� static���� �����Ǵ� ���� �ν��Ͻ�
	}

}

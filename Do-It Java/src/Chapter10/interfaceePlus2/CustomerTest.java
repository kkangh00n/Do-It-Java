package Chapter10.interfaceePlus2;

class Customer implements Buy, Sell { //�������̽� ���� ���
	@Override
	public void buy() { //������
		
	}
	@Override
	public void sell() { //������
		
	}
	@Override
	public void order() { //�浹�Ǵ� ����Ʈ �޼ҵ� ������!!
		System.out.println("");
	}
}

public class CustomerTest{
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer; //��ĳ���� : Ŭ���� ���� �޼ҵ常 ȣ�� ����
		buyer.buy(); //buy���� �޼ҵ�
		buyer.order(); //������ �� �޼ҵ� ȣ�� -> ���� �޼ҵ�
		
		Sell seller = customer; //���� ��������~
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer) { //seller�� �ν��Ͻ����� Customer
			Customer customer2 = (Customer)seller; //�ٿ�ĳ����
			customer2.buy();
			customer2.sell();
		}
		customer.order(); //������ �� �޼ҵ� ȣ��
		
		
	}
	
}

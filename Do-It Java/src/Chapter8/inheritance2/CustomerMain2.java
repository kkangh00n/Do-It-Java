package Chapter8.inheritance2;

public class CustomerMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustomer(10030, "������", 2000); //4. Ŭ���� �� ��ȯ(��ĳ����), VIPCustomer �ν��Ͻ��� Customer���� ��������
		vc.bonusPoint = 1000; 
		
		
		System.out.println(vc.showCustomerInfo());
		/*((VIPCustomer)vc).showVIPInfo();*/ // *�ٿ�ĳ����
		//4. vc�� ������ �� �ִ� ������ �޼ҵ�� �θ��� customer.
		
		
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ���" + vc.calcPrice(10000) + "�� �Դϴ�");
		//4. ������ ������ �� calcPrice() ���� ��쿡�� �ڽ��� ���.
 		//4. (�������ε� : ���� ���Ŀ� �ּҸ� ã�ư��� ���� Ȯ����) <-> (�������ε� : static final ��) �ڹ��� ��� �޼ҵ�� ����޼ҵ�...??
		
		
		
	}
}

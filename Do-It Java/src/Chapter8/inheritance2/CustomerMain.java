package Chapter8.inheritance2;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		
		
		VIPCustomer customerkim = new VIPCustomer(10020, "������", 24); //2. super�� ����Ŭ������ �����ڸ� ȣ��
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ���" + customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerkim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ���" + customerkim.calcPrice(price) + "���Դϴ�.");
		//3. �� �ν��Ͻ��� ������ �ݾ��� �ٸ�
	}

}

package Chapter8.inheritance;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Customer �̼���");
		Customer customerlee = new Customer();
		customerlee.setCustomerID(10010);
		customerlee.setCustomerName("�̼���");
		customerlee.bonusPoint = 1000;
		System.out.println(customerlee.showCustomerInfo() + "\n");
		
		System.out.println("VIP ������");
		VIPCustomer customerkim = new VIPCustomer(); 
		//2. ����Ŭ������ �����ڰ� ȣ��Ǳ� ��, ����Ŭ������ �����ڰ� ���� ȣ��ȴ�.
		//2. �����Ϸ��� ����Ŭ������ �����ڰ� super()�� �ڵ����� ȣ���ϱ� ����!!
		
		customerkim.setCustomerID(10020);  //1. CustomerŬ������ ��ӹ޾ұ� ������ �� �ȿ� �ִ� ������ �޼ҵ� ��� ����
		customerkim.setCustomerName("������");
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
		
		
	}

}

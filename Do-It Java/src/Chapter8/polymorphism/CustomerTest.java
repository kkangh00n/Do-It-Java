package Chapter8.polymorphism;
import java.util.ArrayList;
public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerlist = new ArrayList<Customer>();
		
		Customer mansour = new VIPCustomer(1000, "������", 2000);
		Customer lee = new GoldCustomer(950, "�����");
		Customer choi = new GoldCustomer(949, "���¿�");
		Customer kim = new Customer(900, "�谭��");
		Customer yang = new Customer (949, "������");
		
		customerlist.add(mansour);
		customerlist.add(lee);
		customerlist.add(choi);
		customerlist.add(kim);
		customerlist.add(yang);
		
		System.out.println("=====������ ���=====");
		for (Customer c:customerlist) {
			System.out.println(c.showCustomerInfo());
		}
		
		int price = 10000;
		for (Customer c:customerlist) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "����" + cost + "���� �����ϼ̽��ϴ�");
		}
		
	}

}

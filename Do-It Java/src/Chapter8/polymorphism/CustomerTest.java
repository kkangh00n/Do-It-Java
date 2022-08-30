package Chapter8.polymorphism;
import java.util.ArrayList;
public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerlist = new ArrayList<Customer>();
		
		Customer mansour = new VIPCustomer(1000, "만수르", 2000);
		Customer lee = new GoldCustomer(950, "이재용");
		Customer choi = new GoldCustomer(949, "최태원");
		Customer kim = new Customer(900, "김강훈");
		Customer yang = new Customer (949, "양희준");
		
		customerlist.add(mansour);
		customerlist.add(lee);
		customerlist.add(choi);
		customerlist.add(kim);
		customerlist.add(yang);
		
		System.out.println("=====고객정보 출력=====");
		for (Customer c:customerlist) {
			System.out.println(c.showCustomerInfo());
		}
		
		int price = 10000;
		for (Customer c:customerlist) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "님이" + cost + "원을 지불하셨습니다");
		}
		
	}

}

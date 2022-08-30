package Chapter8.inheritance2;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		
		
		VIPCustomer customerkim = new VIPCustomer(10020, "김유신", 24); //2. super로 상위클래스의 생성자를 호출
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은" + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerkim.getCustomerName() + "님이 지불해야 하는 금액은" + customerkim.calcPrice(price) + "원입니다.");
		//3. 두 인스턴스의 내야할 금액이 다름
	}

}

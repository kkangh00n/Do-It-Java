package Chapter8.inheritance;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Customer 이순신");
		Customer customerlee = new Customer();
		customerlee.setCustomerID(10010);
		customerlee.setCustomerName("이순신");
		customerlee.bonusPoint = 1000;
		System.out.println(customerlee.showCustomerInfo() + "\n");
		
		System.out.println("VIP 김유신");
		VIPCustomer customerkim = new VIPCustomer(); 
		//2. 하위클래스의 생성자가 호출되기 전, 상위클래스의 생성자가 먼저 호출된다.
		//2. 컴파일러가 하위클래스의 생성자가 super()를 자동으로 호출하기 때문!!
		
		customerkim.setCustomerID(10020);  //1. Customer클래스를 상속받았기 떄문에 그 안에 있는 변수와 메소드 사용 가능
		customerkim.setCustomerName("김유신");
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
		
		
	}

}

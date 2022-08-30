package Chapter10.interfaceePlus2;

class Customer implements Buy, Sell { //인터페이스 다중 상속
	@Override
	public void buy() { //재정의
		
	}
	@Override
	public void sell() { //재정의
		
	}
	@Override
	public void order() { //충돌되는 디폴트 메소드 재정의!!
		System.out.println("");
	}
}

public class CustomerTest{
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer; //업캐스팅 : 클래스 형의 메소드만 호출 가능
		buyer.buy(); //buy형의 메소드
		buyer.order(); //재정의 된 메소드 호출 -> 가상 메소드
		
		Sell seller = customer; //위와 마찬가지~
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer) { //seller의 인스턴스형이 Customer
			Customer customer2 = (Customer)seller; //다운캐스팅
			customer2.buy();
			customer2.sell();
		}
		customer.order(); //재정의 된 메소드 호출
		
		
	}
	
}

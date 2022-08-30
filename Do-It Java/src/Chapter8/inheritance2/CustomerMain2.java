package Chapter8.inheritance2;

public class CustomerMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustomer(10030, "나몰라", 2000); //4. 클래스 형 변환(업캐스팅), VIPCustomer 인스턴스를 Customer형의 넣은거임
		vc.bonusPoint = 1000; 
		
		
		System.out.println(vc.showCustomerInfo());
		/*((VIPCustomer)vc).showVIPInfo();*/ // *다운캐스팅
		//4. vc가 참조할 수 있는 변수와 메소드는 부모형 customer.
		
		
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은" + vc.calcPrice(10000) + "원 입니다");
		//4. 하지만 재정의 된 calcPrice() 같은 경우에는 자식형 사용.
 		//4. (동적바인딩 : 실행 이후에 주소를 찾아가서 값이 확정됨) <-> (정적바인딩 : static final 등) 자바의 모든 메소드는 가상메소드...??
		
		
		
	}
}

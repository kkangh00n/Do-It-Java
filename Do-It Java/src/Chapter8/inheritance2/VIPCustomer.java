package Chapter8.inheritance2;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); 
		//2. super를 이용한 상위클래스의 생성자 호출
		//2. 상위클래스의 생성자가 매개변수를 받아서 기본생성자가 정의되어있지 않을경우, super(매개변수)로 명시적으로 호출
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("하위클래스 생성자 호출");
	}
	
	
	@Override
	public int calcPrice(int price) { //3. 메소드 오버라이딩 : 상위클래스의 메소드를 하위클래스에서 재정의(반환형, 메소드 이름, 매개변수의 갯수와 자료형 같아야 함 )
		// TODO Auto-generated method stub
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}


	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
		//2. super를 이용한 상위클래스의 메소드 호출 
		//2. 메소드 오버라이딩을 위한 (위 같은 경우는 super를 빼고 그냥 써도 상관없음) -> 함수명이 showCustomerInfo였다면 필요
	}
}

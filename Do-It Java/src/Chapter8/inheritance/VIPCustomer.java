package Chapter8.inheritance;

public class VIPCustomer extends Customer { //1. Customer클래스를 상속받은 VIP클래스
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		//2. 하위클래스의 생성자가 super()를 자동으로 호출
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출"); //2. 
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
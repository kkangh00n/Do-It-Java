package Chapter8.polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); 
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	
	@Override
	public int calcPrice(int price) { 
		// TODO Auto-generated method stub
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}


	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
	}
}

package Chapter8.inheritance;

public class VIPCustomer extends Customer { //1. CustomerŬ������ ��ӹ��� VIPŬ����
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		//2. ����Ŭ������ �����ڰ� super()�� �ڵ����� ȣ��
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��"); //2. 
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
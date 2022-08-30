package Chapter8.inheritance2;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); 
		//2. super�� �̿��� ����Ŭ������ ������ ȣ��
		//2. ����Ŭ������ �����ڰ� �Ű������� �޾Ƽ� �⺻�����ڰ� ���ǵǾ����� �������, super(�Ű�����)�� ��������� ȣ��
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("����Ŭ���� ������ ȣ��");
	}
	
	
	@Override
	public int calcPrice(int price) { //3. �޼ҵ� �������̵� : ����Ŭ������ �޼ҵ带 ����Ŭ�������� ������(��ȯ��, �޼ҵ� �̸�, �Ű������� ������ �ڷ��� ���ƾ� �� )
		// TODO Auto-generated method stub
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}


	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵��" + agentID + "�Դϴ�.";
		//2. super�� �̿��� ����Ŭ������ �޼ҵ� ȣ�� 
		//2. �޼ҵ� �������̵��� ���� (�� ���� ���� super�� ���� �׳� �ᵵ �������) -> �Լ����� showCustomerInfo���ٸ� �ʿ�
	}
}

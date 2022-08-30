package Chapter8.inheritance2;

public class Customer {
		protected int customerID;  //�� id
		protected String customerName; //�� �̸�
		protected String customerGrade; //�� ���
		int bonusPoint; //���ʽ�
		double bonusRatio; //���ʽ� ����
		
		public Customer(int customerID, String customerName) { //2. �Ű������� �޴� ������
			this.customerID = customerID;
			this.customerName = customerName;
			customerGrade = "SILVER";
			bonusRatio = 0.01;
			System.out.println("����Ŭ���� ������ ȣ��");
		}
		
		public int calcPrice(int price) { //���
			bonusPoint += price*bonusRatio;
			return price;
		}
		
		public String showCustomerInfo() {
			return customerName + "���� �����" + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
		}
		
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
}

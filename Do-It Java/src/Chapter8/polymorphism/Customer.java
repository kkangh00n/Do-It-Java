package Chapter8.polymorphism;

public class Customer {
		protected int customerID;  //���� id
		protected String customerName; //���� �̸�
		protected String customerGrade; //���� ���
		int bonusPoint; //���ʽ�
		double bonusRatio; //���ʽ� ����
		
		public Customer(int customerID, String customerName) { 
			this.customerID = customerID;
			this.customerName = customerName;
			customerGrade = "SILVER";
			bonusRatio = 0.01;
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
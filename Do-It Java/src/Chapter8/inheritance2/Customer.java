package Chapter8.inheritance2;

public class Customer {
		protected int customerID;  //고객 id
		protected String customerName; //고객 이름
		protected String customerGrade; //고객 등급
		int bonusPoint; //보너스
		double bonusRatio; //보너스 비율
		
		public Customer(int customerID, String customerName) { //2. 매개변수를 받는 생성자
			this.customerID = customerID;
			this.customerName = customerName;
			customerGrade = "SILVER";
			bonusRatio = 0.01;
			System.out.println("상위클래스 생성자 호출");
		}
		
		public int calcPrice(int price) { //계산
			bonusPoint += price*bonusRatio;
			return price;
		}
		
		public String showCustomerInfo() {
			return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
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

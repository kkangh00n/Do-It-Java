package Chapter6.traffic;

public class UseTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person kim = new person("김강훈", 10000);
		person yang = new person("양희준", 20000);
		person lee = new person("이기우", 5000); 
		person moo = new person("이무성", 8000);
		
		bus Bus1 = new bus("구로 3번");
		bus Bus2 = new bus("고속버스");

		subway Subway1 = new subway("1호선");
		subway Subway7 = new subway("7호선");
		
		// 김강훈의 등교
		kim.takebus(Bus1);
		kim.takesubway(Subway7);
		kim.showInfo();
		
		// 양희준의 등교
		yang.takesubway(Subway7);
		yang.showInfo();
		
		// 이기우의 등교
		lee.takesubway(Subway1);
		lee.showInfo();
		
		// 이무성의 등교
		moo.takebus(Bus2);
		moo.showInfo();
		
		System.out.println("구로 3번 버스 승객 수 : " + Bus1.passenger + "  수입 : " + Bus1.money);
		System.out.println("고속 버스 승객 수 : " + Bus2.passenger + "  수입 : " + Bus2.money);
		System.out.println("1호선 승객 수 : " + Subway1.passenger + "  수입 : " + Subway1.money);
		System.out.println("7호선 승객 수 : " + Subway7.passenger + "  수입 : " + Subway7.money);
		
		
	}

}

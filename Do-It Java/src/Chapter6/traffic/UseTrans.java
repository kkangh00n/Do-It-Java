package Chapter6.traffic;

public class UseTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person kim = new person("�谭��", 10000);
		person yang = new person("������", 20000);
		person lee = new person("�̱��", 5000); 
		person moo = new person("�̹���", 8000);
		
		bus Bus1 = new bus("���� 3��");
		bus Bus2 = new bus("��ӹ���");

		subway Subway1 = new subway("1ȣ��");
		subway Subway7 = new subway("7ȣ��");
		
		// �谭���� �
		kim.takebus(Bus1);
		kim.takesubway(Subway7);
		kim.showInfo();
		
		// �������� �
		yang.takesubway(Subway7);
		yang.showInfo();
		
		// �̱���� �
		lee.takesubway(Subway1);
		lee.showInfo();
		
		// �̹����� �
		moo.takebus(Bus2);
		moo.showInfo();
		
		System.out.println("���� 3�� ���� �°� �� : " + Bus1.passenger + "  ���� : " + Bus1.money);
		System.out.println("��� ���� �°� �� : " + Bus2.passenger + "  ���� : " + Bus2.money);
		System.out.println("1ȣ�� �°� �� : " + Subway1.passenger + "  ���� : " + Subway1.money);
		System.out.println("7ȣ�� �°� �� : " + Subway7.passenger + "  ���� : " + Subway7.money);
		
		
	}

}

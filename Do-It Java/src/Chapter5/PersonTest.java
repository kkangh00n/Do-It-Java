package Chapter5;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Ronaldo = new Person();
		
		Ronaldo.name = "Ronaldo";
		System.out.println("Ronaldo �̸� :" + Ronaldo.name);

		
		Person James = new Person("James", 25, 178, 91);
		James.married=true;
		James.child=3;
		
		
		System.out.println("James �̸� :" + James.name);
		System.out.println("���� :" + James.age);
		System.out.println("Ű :" + James.height);
		System.out.println("������ :" + James.weight);
		System.out.println("��ȥ ���� :" + James.married);
		System.out.println("�ڳ� �� :" + James.child);
	}

}

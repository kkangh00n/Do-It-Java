package Chapter5;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Ronaldo = new Person();
		
		Ronaldo.name = "Ronaldo";
		System.out.println("Ronaldo 이름 :" + Ronaldo.name);

		
		Person James = new Person("James", 25, 178, 91);
		James.married=true;
		James.child=3;
		
		
		System.out.println("James 이름 :" + James.name);
		System.out.println("나이 :" + James.age);
		System.out.println("키 :" + James.height);
		System.out.println("몸무게 :" + James.weight);
		System.out.println("결혼 여부 :" + James.married);
		System.out.println("자녀 수 :" + James.child);
	}

}

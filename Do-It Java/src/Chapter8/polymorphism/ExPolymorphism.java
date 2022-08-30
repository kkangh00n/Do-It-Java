package Chapter8.polymorphism;
// �������� ��
// 1. ��Ӱ���
// 2. �޼ҵ� �������̵�
// 3. ��ĳ�������� ��ü ����
// 4. �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� �޼ҵ� ȣ��
class Animal{
	public void move() {
		System.out.println("������ �����δ�.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �ȴ´�.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ڴ�.");
	}
}
class Eagle extends Animal{
	public void move () {
		System.out.println("�������� �ϴ��� ����.");
	}
}


public class ExPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printinfo(new Human());
		printinfo(new Tiger());
		printinfo(new Eagle());
	}
	
	public static void printinfo(Animal animal) {  // 5. Animal animal = new Human();
		animal.move(); // 5. Human.move();
	}
}

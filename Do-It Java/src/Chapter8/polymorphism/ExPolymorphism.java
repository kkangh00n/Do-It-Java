package Chapter8.polymorphism;
// 다형성의 예
// 1. 상속관계
// 2. 메소드 오버라이딩
// 3. 업캐스팅으로 객체 선언
// 4. 부모클래스 객체로 자식클래스 메소드 호출
class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷는다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뛴다.");
	}
}
class Eagle extends Animal{
	public void move () {
		System.out.println("독수리가 하늘을 난다.");
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

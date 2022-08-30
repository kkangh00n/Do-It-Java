package Chapter7.Exercise;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dog = new Dog[5];
	
		dog[0] = new Dog("해피", "치와와");
		dog[1] = new Dog("초코", "스피치");
		dog[2] = new Dog("솜사탕", "비숑");
		dog[3] = new Dog("인절미", "진돗개");
		dog[4] = new Dog("덕칠", "허스키");
		
		for(Dog d:dog) {
			d.showInfo();
		}
		
		
		
		
	}

}

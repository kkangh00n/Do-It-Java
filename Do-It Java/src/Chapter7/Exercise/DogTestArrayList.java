package Chapter7.Exercise;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("해피", "치와와"));
		dogList.add(new Dog("초코", "스피치"));
		dogList.add(new Dog("솜사탕", "비숑"));
		dogList.add(new Dog("인절미", "진돗개"));
		dogList.add(new Dog("덕칠", "허스키"));
		
		for(Dog dog:dogList) {
			dog.showInfo();
		}
		
	}

}

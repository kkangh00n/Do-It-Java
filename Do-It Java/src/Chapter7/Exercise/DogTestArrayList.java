package Chapter7.Exercise;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("����", "ġ�Ϳ�"));
		dogList.add(new Dog("����", "����ġ"));
		dogList.add(new Dog("�ػ���", "���"));
		dogList.add(new Dog("������", "������"));
		dogList.add(new Dog("��ĥ", "�㽺Ű"));
		
		for(Dog dog:dogList) {
			dog.showInfo();
		}
		
	}

}

package Chapter7.Exercise;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dog = new Dog[5];
	
		dog[0] = new Dog("����", "ġ�Ϳ�");
		dog[1] = new Dog("����", "����ġ");
		dog[2] = new Dog("�ػ���", "���");
		dog[3] = new Dog("������", "������");
		dog[4] = new Dog("��ĥ", "�㽺Ű");
		
		for(Dog d:dog) {
			d.showInfo();
		}
		
		
		
		
	}

}

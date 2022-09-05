package Chapter15.serialization;

//����ȭ : �ν��Ͻ� �������� ��Ʈ������ ����

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ 									//1. Serializble : Ŭ������ ����ȭ�ϰڴٴ� �ǵ��� ǥ��

	
	private static final long serialVersionUID = -6968352997181711430L;	//2. serialVersionUID : ����ȭ, ������ȭ �� �� ������ ���ϱ� ���� 
	String name;
	transient String job; 												//3. transient : �� ������ ����ȭ���� ����
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name= name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + job;
	}
}

class Dog implements Externalizable{									//4. Externalizable : �������̽� ���� �����Ͽ� ��ü�� ����ȭ�� ������ ����

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	String name;
	
	public Dog() {}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {	//Externalizable�� �޼ҵ�
		// TODO Auto-generated method stub
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {	//Externalizable�� �޼ҵ�
		// TODO Auto-generated method stub
		name = in.readUTF();
	}
}




public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personAhn = new Person("�����", "��ǥ�̻�");
		Person personKim = new Person("��ö��", "���̻�");
		
		try(FileOutputStream fos1 = new FileOutputStream("src/Chapter15/serial.out"); ObjectOutputStream oos1 = new ObjectOutputStream(fos1)){
			//FileOutputStream���� ������ ���� ��Ʈ���� ���� ��, ������Ʈ�� ObjectOutputStream���� ����
			oos1.writeObject(personAhn); 		//������Ʈ���� ���� Person��ü ���Ͽ� ��
			oos1.writeObject(personKim);		//������Ʈ���� ���� Person��ü ���Ͽ� ��
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis1 = new FileInputStream("src/Chapter15/serial.out"); ObjectInputStream ois1 = new ObjectInputStream(fis1)){
			//FileInputStream���� �о�帱 ���� ��Ʈ���� ���� ��, ������Ʈ�� ObjectInputStream���� ����
			Person p1 = (Person)ois1.readObject();		//������Ʈ���� ���� ��ü�� �о�帮��, Person������ ����
			Person p2 = (Person)ois1.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Dog myDog = new Dog();
		myDog.name = "�۸���";
		
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/external.out"); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(myDog);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("src/Chapter15/external.out"); ObjectInputStream ois = new ObjectInputStream(fis)){
			Dog dog = (Dog)ois.readObject();
			System.out.println(dog);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

package Chapter15.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/data.txt"); DataOutputStream dos = new DataOutputStream(fos)){
			
			//������ ����Ʈ������ ����ϴ� ��Ʈ�� ���� ��, �� ��Ʈ���� �������� �ڷ����� ũ�⸦ �״�� �����ϴ� ���� ��Ʈ������ ����!!
			
			//���� �ڷ����� �˸°� �ڷḦ ��
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("src/Chapter15/data.txt"); DataInputStream dis = new DataInputStream(fis)){
			
			//�ڷ����� �°� �ڷḦ �о� ���, ������ ���ƾ� ��
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

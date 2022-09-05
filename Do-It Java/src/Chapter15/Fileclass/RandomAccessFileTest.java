package Chapter15.Fileclass;

//���� �����͸� ���� ������ ���� ��ġ�� ����Ŵ

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("src/Chapter15/Fileclass/random.txt", "rw");
		
		rf.writeInt(100);												//4����Ʈ
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		rf.writeDouble(3.14);											//8����Ʈ
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");											//�ѱۻ�� 3*5 + null���� 2 = 17����Ʈ
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		
		rf.seek(0);														//�����͸� 0���� ��ġ��Ŵ. �츮�� �о�� �� ������ �� ó���� 0�����̴�.
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}

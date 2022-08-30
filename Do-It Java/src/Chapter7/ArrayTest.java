package Chapter7;
// 기본자료형
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,7,8,9,10}; // or new int[] {1,2,3,4,5,6,7,8,9,10}
		int sum = 0;
		for (int i=0; i<10; i++)
		{
			System.out.println(num[i]);
			sum += i;
		}
		System.out.println(sum);
	}
}

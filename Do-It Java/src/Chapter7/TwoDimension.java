package Chapter7;
//2차원 배열 선언과 출력
public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Array= {{1,2,3}, {4,5,6}};
		int[][] Array2 = new int[3][3];
		
		for  (int i=0; i<Array.length; i++) {
			for (int j=0; j<Array[i].length; j++)
			{
				System.out.println(Array[i][j]);
			}
		}
		System.out.println();
		for  (int i=0; i<Array.length; i++) {
			for (int j=0; j<Array[i].length; j++)
			{
				System.out.println(Array2[i][j]);
			}
		}
	}

}
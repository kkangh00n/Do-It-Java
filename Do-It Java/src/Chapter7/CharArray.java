package Chapter7;
// 기본자료형
public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int j=0; j<26; j++, ch++)
		{
			alphabets[j] = ch;
		}
		
		for (int i=0; i<26; i++)
		{
			
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
	}

}

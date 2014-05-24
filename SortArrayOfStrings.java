import java.util.*;

public class SortArrayOfStrings {

	public static void main(String[] args) {

		Scanner  input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		String[] stringsArr = new String[n];
		
		for (int i = 0; i < stringsArr.length; i++) {
			stringsArr[i] = input.next();
		}

		Arrays.sort(stringsArr);
	
		for (int i = 0; i < stringsArr.length; i++) {
			System.out.println(stringsArr[i]);
		}
		
	}
}

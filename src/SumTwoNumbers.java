import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = input.nextInt();
		
		System.out.print("b = ");
		int b = input.nextInt();
		
		int result = a + b;
		
		System.out.printf("result = %d",result);
		
	}

}

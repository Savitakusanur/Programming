import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the range of the number is divisible br 2 and 5  ");
		int n=scan.nextInt();
		divisibleBy2And5(n);
	}
	public static void divisibleBy2And5(int n) {
		for (int i=1;i<=n;i++)
		{
			if(i%2==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}

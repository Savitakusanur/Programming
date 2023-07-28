import java.util.Scanner;

public class Solution6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the range of the number is divisible by 3 and 5   ");
		int n=scan.nextInt();
		divisibleBy3And5(n);
	}
	public static void divisibleBy3And5(int n) {
		for (int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}

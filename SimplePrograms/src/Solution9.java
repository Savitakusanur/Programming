import java.util.Scanner;

public class Solution9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number which is even number is divisible by 3 ");
		int n=scan.nextInt();
		oddNumberDivisibleBy5(n);
	}
	public static void oddNumberDivisibleBy5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0 && i%5==0)
			{
				System.out.println(i);
				
			}
		}
	}
}

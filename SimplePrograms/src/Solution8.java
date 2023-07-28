import java.util.Scanner;

public class Solution8 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number which is even number is divisible by 3 ");
	int n=scan.nextInt();
	evenNumberDivisibleBy3(n);
}
public static void evenNumberDivisibleBy3(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(i%2==0 && i%3==0)
		{
			System.out.println(i);
			
		}
	}
}
}

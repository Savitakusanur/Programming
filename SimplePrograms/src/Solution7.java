import java.util.Scanner;

public class Solution7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Untill where you NEed Prime numbers");
	int n=scan.nextInt();
	int count=0;
	for(int i=3;i<=n;i++)
	{
		int res=checkPrime(i);
		if(res!=0)
		{
			System.out.println(res);
			count++;
		}
	}
	System.out.println("Number of prime numbers :"+count);
}
	public static int checkPrime(int number) {
		for(int i=2;i<number;i++) 
		{
			if(number%i==0)
			{
				return 0;
			}
		}
		return number;
	
}
}

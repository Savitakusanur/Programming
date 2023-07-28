import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number which is greter then 100 ");
	int n=scan.nextInt();
	printNumbers(n);
}
public static void printNumbers(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(n>100)
		{
			System.out.println(i);
		}
	}

		System.out.println("See the Massage properly");
	
}
}

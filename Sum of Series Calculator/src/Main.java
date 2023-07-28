import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n ");
		int n=scan.nextInt();
		
		calculateSumOfSeries(n);
	}
	public static void calculateSumOfSeries(int n)
	{
		double i, sum=0;
		for( i=1;i<=n;i++)
		{
			 sum=sum+1/i;
		}
		System.out.println(sum);
	}

}


public class Series {
	public static void fibonacciSeries(int n)
	{
	int fib1=0;
	int fib2=1;
	if (n==1)
	{
		System.out.print(fib1+" ");
	}
	else if(n==2)
	{
		System.out.print(fib1+" "+fib2);
	}
	else
	{
		System.out.print(fib1+" "+fib2+" ");
		for(int i=3;i<=n;i++)
		{
			int nextNo=fib1+fib2;
			fib1=fib2;
			fib2=nextNo;
			System.out.print(nextNo+" ");
		}
	}
	}
}

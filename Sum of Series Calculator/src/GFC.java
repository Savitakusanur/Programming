import java.util.Scanner;

public class GFC {
public static double sum(int n) {
	double i,s=0.0;
	for ( i=1;i<=n;i++)
	{
		s=s+1/i;
	}
	return s;	
}
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter N ");
	int n=scan.nextInt();	
	System.out.println(sum(n));
}
}

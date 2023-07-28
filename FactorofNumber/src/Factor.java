import java.util.Scanner;

public class Factor {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter N");
	int n=scan.nextInt();
	int factor;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
		}
	}
}
}

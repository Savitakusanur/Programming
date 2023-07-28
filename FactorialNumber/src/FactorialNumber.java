import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter N");
	int n=scan.nextInt();
	int num=1;
	for(int i=1;i<=n;i++)
	{
		num=num*i;
	}
	System.out.println("factorial of number "+num);
}
}

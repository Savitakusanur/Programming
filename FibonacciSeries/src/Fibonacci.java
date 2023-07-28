import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter n");
	int n=scan.nextInt();
	Series s=new Series();
	s.fibonacciSeries(n);
}
}

import java.util.Scanner;

public class PalindromApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter NUmber");
	int n=scan.nextInt();
	Palindrom palindrom=new Palindrom();
	int rev=palindrom.reversNumber(n);
	System.out.println("Reverse of the NUmber is  "+rev);
	if(n==rev)
	{
		System.out.println("Entered number "+n+" is Palindrome ");
	}
	else
	{
		System.out.println("Entered Number "+n+" is not Polindreome");
	}
}
}

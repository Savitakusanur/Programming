import java.util.Scanner;

public class ArmStrongNumberApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=scan.nextInt();
		int originalNo=num;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		ArmStrongNumber armStrongNumber=new ArmStrongNumber();
		int res=armStrongNumber.CheckArmStrong(originalNo,count);
		if(res==originalNo)
		{
			System.out.println("yes, "+originalNo+" It is Armstong Number");
		}
		else
		{
			System.out.println("No,"+originalNo+" It is Not Armstong Number");

		}
	}

}

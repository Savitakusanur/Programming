
public class ArmStrongNumber {
public int power(int n,int count)

{
	int res=(int) Math.pow(n, count);
	return res;	
}
public int CheckArmStrong(int n,int count)
{
	ArmStrongNumber armStrongNumber=new ArmStrongNumber();
	int sum=0;
	while(n!=0)
	{
		int rem=n%10;
		int res=armStrongNumber.power(rem, count);
		sum=sum+res;
		n=n/10;
	}
	return sum;
}
}

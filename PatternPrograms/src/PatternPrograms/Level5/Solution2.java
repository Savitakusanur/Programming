package PatternPrograms.Level5;

public class Solution2 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{ 
			System.out.print("  ");
			if(i==1 || i==5 || j==1 || j==5)
				
			System.out.print("*");
		}
		System.out.println();
		
	}
}
}

//  6 
//  5 4 
// 3 2 1 
package patternPrograms;

public class Pattern_type_12 
{

	public static void main(String[] args)
	{int count=6;
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}

	}

}

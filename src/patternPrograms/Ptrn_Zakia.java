//10
//8	6
//4	2	0
package patternPrograms;

public class Ptrn_Zakia {

	public static void main(String[] args) 
	{
		int count=10;
		for(int i=1;i<=3;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(count+"\t");
				count=count-2;
			}
			System.out.println();
		}

	}

}

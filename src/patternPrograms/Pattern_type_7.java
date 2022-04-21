//5	
//5	4	
//5	4	3	
//5	4	3	2	
//5	4	3	2	1
package patternPrograms;

public class Pattern_type_7 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+"\t");
			}
			System.out.println();

		}

	}

}

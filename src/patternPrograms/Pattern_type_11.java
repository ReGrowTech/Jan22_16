//	1	3	5	7	9
//	3	5	7	9
//	5	7	9
//	7	9	
//	9
package patternPrograms;

public class Pattern_type_11 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i=i+2)
		{
			for(int j=i;j<=9;j=j+2)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}

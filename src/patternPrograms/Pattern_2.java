package patternPrograms;
//Patter program 05 Capsule 50 
//  6 
// 5 4 
//3 2 1 
public class Pattern_2 {

	public static void main(String[] args) {
	
		int z=6;
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(z+ " ");
				z--;
			}
			
			
			System.out.println("");
		}

	}
}


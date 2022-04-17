package My_swapping;

public class Nested_for {

	public static void main(String[] args) {

		int count = 1;
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(count);  //j //2*j
				count++;

			}
			System.out.println();
		}
	}

}

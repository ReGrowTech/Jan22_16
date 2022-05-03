//WAP to print the first nth prime number
package may.Sen_program;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the nth index : ");
		int nth= sc.nextInt();
		int count=0;
		for(int num=2;true;num++)
		{
			boolean prime=true;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime)
			{	count++;
				System.out.println(count+")\t"+ num);
				if (count==nth)
					break;
			}
		}

	}

}

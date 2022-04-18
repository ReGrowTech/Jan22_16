package basic_java_programs;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		boolean primecheck=true;
		if (num>1)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					primecheck=false;
					break;
				}
			}
			if(primecheck)
				System.out.println(num+" : is a Prime Number");
			else 
				System.out.println(num+" : is a not a Prime Number");
		}
		else 
			System.out.println("Enter any number greater than 1");
		sc.close();

	}

}

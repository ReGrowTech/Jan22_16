//Capsule 47 : Ques :1
//WAP to create 2 methods(1 static method and other a non-static method)-one to check if a number is 
//prime number and the other to find the factorial of a number. Call these methods from main method.
package method_programs;
import java.util.Scanner;
public class Prime_and_Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num= sc.nextInt();
		prime(num);
		new Prime_and_Factorial ().factorial(num);
		sc.close();
	}
	public static void prime(int num)
	{
		if(num>1)
		{
			boolean prime_check=true;
			for(int i =2;i<num;i++)
				if(num%i==0)
				{
					prime_check=false;
					break;
				}
			if(prime_check)
				System.out.println(num+" : is a Prime number.");
			else
				System.out.println(num+" : is not a Prime number.");
		}
		else
			System.out.println("Enter number greater than 1");
	}
	public void factorial(int num)
	{
		int fact=1;
		for(int i= 1;i<=num;i++)
			fact=fact*i;
		System.out.println(num+"! : "+fact);
	}
}
//output
//Enter number : 5
//5 : is a Prime number.
//5! : 120

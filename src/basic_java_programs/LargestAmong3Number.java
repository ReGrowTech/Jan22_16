//capsule 5 ques 4
//WAP to find the largest among 3 number using if-else
package basic_java_programs;
import java.util.Scanner;
public class LargestAmong3Number 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter num1 : ");
		int a= sc.nextInt();
		System.out.print(" Enter num2 : ");
		int b= sc.nextInt();
		System.out.print(" Enter num3 : ");
		int c= sc.nextInt();
		int max;
		if(a>b)
		{
			if(a>c)
				max=a;
			else
				max=c;	
		}
		else if(b>c)
			max=b;
		else
			max=c;
		System.out.println("Largest among "+a+" "+b+" "+c+" is : "+max);
		sc.close();
	}
}

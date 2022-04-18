//capsule 6 question 2 
//WAP to the minimum among 3 values using if-else
package basic_java_programs;
import java.util.Scanner;
public class MinimumAmong3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num 2 : ");
		int b = sc.nextInt();
		System.out.print("Enter num 3 : ");
		int c = sc.nextInt();
		int min;
		if(a<b)
		{
			if(a<c)
				min=a;
			else
				min=c;
		}
		else if(b<c)
			min=b;
		else 
			min=c;
		System.out.println("Minimum among "+a+" "+b+" "+c+" is : "+min);
		
		sc.close();
	}
}

package basic_java_programs;
import java.util.Scanner;
public class FactorialUsingWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Nubmer : ");
		int num=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;	
		}
		System.out.println("Factorial of "+num+" : "+fact);
		sc.close();

	}
}

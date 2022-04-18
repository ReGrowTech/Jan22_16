//capsule 5 ques 3
//WAP using ternary operator to display a number is even or odd
package basic_java_programs;
import java.util.Scanner;
public class Even_Odd_Program
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number : ");
		System.out.print(((sc.nextInt())%2==0?"EVEN Number":"ODD Number"));
		sc.close();
	}

}

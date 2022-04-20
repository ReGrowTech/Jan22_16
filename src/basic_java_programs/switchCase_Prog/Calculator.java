//capsule 6 ques 3
// WAP for calculator
package basic_java_programs.switchCase_Prog;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num 1 : ");
		int num1= sc.nextInt();
		System.out.print("Enter num 2 : ");
		int num2= sc.nextInt();
		System.out.print("Enter + for addition\nEnter - for subtraction\nEnter * for multiplication\nEnter / for division\nENTER CHOICE : ");
		char choice=sc.next().charAt(0);
		switch (choice)
		{
		case '+':System.out.println("Sum is : "+(num1+num2));
		break;
		case '-':System.out.println("Difference is : "+(num1-num2));
		break;
		case '*':System.out.println("Product is : "+(num1*num2));
		break;
		case '/':System.out.println("quotient is : "+(num1/num2)+"remainder is : "+(num1%num2));
		break;
		default:System.out.println("Wrong choice");
		}
		sc.close();
	}

}

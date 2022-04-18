//capsule 7 
package basic_java_programs;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Year : ");
		System.out.print(((sc.nextInt()%4==0)?"Leap Year":"Not a Leap Year"));
	}
}

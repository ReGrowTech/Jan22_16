//Capsule 51 program 4
//WAP in java to find whether  a number is buzz number or not

package basic_java_programs;
import java.util.Scanner;
public class Buzz_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number : ");
		int num= sc.nextInt();
		if(num%7==0 || num%10==7)
			System.out.println(num+" : is a Buzz Number. ");
		else
			System.out.println(num+" : is not a Buzz Number. ");
		sc.close();
	}

}

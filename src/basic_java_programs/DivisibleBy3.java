//capsule 8 ques 2
//WAP to print all number divisible by 3 between 1 to n
package basic_java_programs;
import java.util.Scanner;
public class DivisibleBy3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the last number : ");
		int last =sc.nextInt();
		System.out.println("The numbers that are divisible between 1 and "+last+" are : ");
		for(int i =1; i<=last;i++)
			if(i%3==0)
			System.out.println(i);
		sc.close();
	}

}

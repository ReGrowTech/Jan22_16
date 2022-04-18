//capsule 7 ques 3
package basic_java_programs;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int temp=num;
		int rev_num=0;
		while(num!=0)
		{
			int ld=num%10;
			rev_num=rev_num*10+ld;
			num/=10;
		}
		System.out.println("The reversed number is : "+ rev_num);
		System.out.println((temp==rev_num?+temp+" is Palindrome":+temp+" is not Palindrome"));
		sc.close();
	}
}

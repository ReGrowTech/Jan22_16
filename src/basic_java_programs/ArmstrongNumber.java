package basic_java_programs;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		int temp=num;
		int s=0;
		while(num!=0)
		{
			int ld=num%10;
			s=s+(ld*ld*ld);
			num/=10;
		}
		if (s==temp)
			System.out.println(temp+" is a Armstrong Number");
		else
			System.out.println(temp+" is not a Armstrong Number");
		sc.close();
	}

}

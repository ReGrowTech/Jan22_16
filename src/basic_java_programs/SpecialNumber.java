package basic_java_programs;
import java.util.Scanner;
public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int ld=num%10;
			int fact=1;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
		}
		System.out.println((sum==temp?+temp+" : is a Special number" :+temp+" : is not a Special number" ));
		sc.close();
	}

}

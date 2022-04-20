package My_swapping;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {

		int year;
		Scanner sc = new Scanner(System.in);
		 year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("This is a leap year"+year);
		}
		else
		{
			System.out.println("This is not a leap year"+year);
		}
		
		
	}

}

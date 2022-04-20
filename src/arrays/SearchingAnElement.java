//CAPSULE 47 QUES 3
//WAP TO CHECK IF A NUMBER IS PRESENT IN AN ARRAY
package arrays;
import java.util.Scanner;
public class SearchingAnElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		boolean find=false;
		System.out.print("Enter the number you want to search : ");
		int search=sc.nextInt();
		for(int num : arr)
			if(num==search)
			{
				find=true;
				break;
			}
		if(find)
		{
			System.out.print(search+" : is present in array :: ");
			for(int num : arr)
				System.out.print(num+"\t");
		}
		else
		{
			System.out.print(search+" : is not present in array :: ");
			for(int num : arr)
				System.out.print(num+"\t");

		}
		sc.close();
	}

}

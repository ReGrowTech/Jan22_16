//CAPSULE 47 QUES 3
//WAP TO CHECK IF A NUMBER IS PRESENT IN AN ARRAY
package arrays;
import java.util.Scanner;
public class SearchingIn_2D_array
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		boolean found=false;
		System.out.print("Enter the number to be searched : ");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==num)
				{
					found=true;
					break;
				}
			}
			if(found)
				break;
		}
		if(found)
			System.out.println(num+" is present in the array ");
		else
			System.out.println(num+" is not present in the array ");
		sc.close();
	}

}

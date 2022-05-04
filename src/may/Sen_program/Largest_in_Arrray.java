package may.Sen_program;

import java.util.Scanner;

public class Largest_in_Arrray
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int arr[] = {200,65,92,10,25,30,58,80,95};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
//		System.out.println("\nEnter the nth value within "+arr.length+" : ");
//		int nth=sc.nextInt();
//		System.out.println(nth+" Largest in array is "+arr[nth-1]);
//		
		System.out.println("Enter the nth value within "+arr.length+" : ");
		int sth=sc.nextInt();
		System.out.println(sth+" smallest in array is "+arr[arr.length-sth]);

	}

}

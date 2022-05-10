package arrays;
import java.util.Scanner;
public class Search_small_large {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element at "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		System.out.print("\nThe entered array is : ");
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("\nThe array in accending order is : ");
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		System.out.print("\nEnter the nth value of the smallest no. to be searched : ");
		int n=sc.nextInt();
		System.out.println("\nThe "+n+"th smallest no is : "+arr[n-1]);
		System.out.print("\nEnter the mth value of the largest no. to be searched : ");
		int m=sc.nextInt();
		System.out.println("\nThe "+m+"th largest no is : "+arr[arr.length-m]);
	}

}

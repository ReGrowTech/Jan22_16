//Capsule 53 program5
//wap in java to find the 3rd largest value in an array
package arrays.array_sorting_programs;

import java.util.Scanner;
public class LargeNsmall {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Array size :");
		int size= sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element at "+(i+1)+ " : ");
			arr[i]=sc.nextInt();
		}
		System.out.print("The entered array elements are : " );
		for(int e :arr)
		System.out.print(e+"\t");
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
		System.out.print("\nArray elements in accending order : " );
		for(int e :arr)
			System.out.print(e+"\t");
		
		System.out.print("\nThird largest value : "+arr[arr.length-3]);
		sc.close();

	}

}

// Selection Sort of Array of length 10
package array_sorting_programs;
public class SelectionSort
{
	public static void main(String[] args)
	{
		int arr[]= {6,8,2,7,3,9,10,4,1,5};//array length : 10
		System.out.print("Unsorted Array : ");
		for(int a :arr)
			System.out.print(a+" ");
		System.out.print("\nSorted Array using Selection Sort Technique : ");
		for(int i=0;i<arr.length-1;i++)// as array length is 10,iteration 1 less than arr length
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
		for(int a :arr)
			System.out.print(a+" ");
	}

}

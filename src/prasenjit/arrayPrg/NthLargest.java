package prasenjit.arrayPrg;

public class NthLargest {

	public static void main(String[] args) {
		int arr[]= {1,4,7,9,5,3,8,6,2,10};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
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
		System.out.println("\nSorted Array :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\nThe 3rd largest number : " +arr[arr.length-3]);
		

	}

}

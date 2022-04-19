// capsule 46 ques 4 : WAP to find the 3rd largest and 4th smallest in an array
package arrays;
public class MaxMin 
{
	public static void main(String[] args) {
		int arr[]= {9,10,1,8,7,3,6,2,4,5};
		System.out.print("Array : ");
		for(int num : arr)
			System.out.print(num+"\t");
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.print("\nSorted Array : ");
		for(int num : arr)
			System.out.print(num+"\t");
		System.out.println("\n3rd largest : "+arr[arr.length-3]);
		System.out.println("4th smallest : "+arr[3]);
	}

}



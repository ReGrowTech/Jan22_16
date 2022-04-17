package arrays;
//output should not have duplicate elements
public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,88,56,7,7,18,26,3,88,3};
		//desired output : 1,88,56,7,18,26,3
		int[]temp= new int[arr.length];
		for( int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]= -99999;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!= -99999)
			{
				System.out.println(arr[i]);
			}
		}
		   
				

	}

}

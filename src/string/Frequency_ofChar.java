package string;

public class Frequency_ofChar {

	public static void main(String[] args) {
		String str= "Regrowtech";
		char arr[]= str.toCharArray();
		int l=str.length();
		
		for(int i=0; i<l-1;i++) 
		{
			int	counter=1;
	              for(int j=i+1;j<l;j++) 
	              {
	            	  if(arr[i]==arr[j]) {
	            		  counter++;
	            	  }
	              }
	              System.out.println(arr[i]+" : "+counter);
		}
    
	}

}

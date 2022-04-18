package string;

public class Pallindrome_string {

	public static void main(String[] args) {
		String str= "Madam";
		str= str.toLowerCase();
		String rev= "";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch= str.charAt(i);
			rev= ch+rev;
		}
		if(str.equals(rev))
		{
			System.out.println("pallindrome string");
		}
		else
		{
			System.out.println("not pallindrome string");
		}
		

	}

}

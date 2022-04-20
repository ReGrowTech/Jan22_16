//WAP TO PRINT ALL THE CHARACTERS IN A SENTENCE
package string;
import java.util.Scanner;
public class All_Char_of_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String str=sc.nextLine();
		str=str.trim().replaceAll("\\s+","");
		System.out.println("The characters are : ");
		for(int i=0;i<str.length();i++)
		{
			System.out.println((i+1)+")\t"+str.charAt(i));
		}
		sc.close();


	}

}

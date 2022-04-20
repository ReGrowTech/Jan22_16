//Capsule 47 ques 2 : WAP to find the frequency of characters in a string
package string;
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str =sc.nextLine();
		str=str.trim().replaceAll("\\s+","").toLowerCase();
		char alpha[]=str.toCharArray();
		int freq[]= new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j=1+i;j<str.length();j++)
			{
				if(alpha[i]==alpha[j])
				{
					freq[i]++;
					alpha[j]='0';
				}
			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(alpha[i]!='0')
				System.out.print(alpha[i]+" : "+freq[i]+"\t");
		}
		sc.close();
	}

}
//output
//Enter a string : Regrow Tech
//r : 2	e : 2	g : 1	o : 1	w : 1	t : 1	c : 1	h : 1	
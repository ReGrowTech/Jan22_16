//Capsule 52 program 5
//wap to find the frequency of words in a sentence
package string;
import java.util.Scanner;
public class FreqWord 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter sentence : ");
		String str=sc.nextLine();
		str=str.trim().replaceAll("\\s+"," ").toLowerCase();
		String words[]=str.split(" ");
		int freq[]=new int[words.length];
		for(int i=0;i<words.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					freq[i]++;
					words[j]= words[j].replace(words[j],"0");
				}
				
			}
		}
		for(int i=0;i<words.length;i++)
		{
			if(!words[i].equals("0"))
				System.out.println(words[i]+ "\t: frequency :\t"+freq[i] );
		}

	}

}

//output 
//Enter sentence : I love India India is my love
//i		: frequency :	1
//love	: frequency :	2
//india	: frequency :	2
//is	: frequency :	1
//my	: frequency :	1
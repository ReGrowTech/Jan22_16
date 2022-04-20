package string;

public class Remove_vowels {

	public static void main(String[] args) {
		String s="Reshma";
		char result, not_vowel;
		String lc= s.toLowerCase();
		char[] c=lc.toCharArray();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				result=c[i];
				//System.out.println("vowel found:"+result);
			}
			else 
			{
				not_vowel=c[i];
				System.out.println("cosonent:"+not_vowel);
			} 
		}


	}
}
 
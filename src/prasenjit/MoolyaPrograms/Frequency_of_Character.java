package prasenjit.MoolyaPrograms;

public class Frequency_of_Character {

	public static void main(String[] args) {
		String name= "Prasenjit Sen";
		name=name.toLowerCase().replaceAll("\\s+","");
		char[] ch =name.toCharArray();
		int freq[]=new int[ch.length];

		for(int i=0;i<ch.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='0';
					freq[i]++;
				}
			}
		}
		for(int i=0; i<ch.length;i++)
		{
			if(freq[i]>1 && ch[i]!='0')
				System.out.println(ch[i]+" : "+freq[i]);
		}
	}

}

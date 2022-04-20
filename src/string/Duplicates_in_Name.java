package string;

import java.util.LinkedHashSet;

public class Duplicates_in_Name {

	public static void main(String[] args) {
		String name = "Shafaque Nayyar Mallick";
		name.toLowerCase();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for (int i=0;i<name.length();i++)
		{
			for(int j=i+1; j<name.length();j++)
			{
				if((name.charAt(i)== name.charAt(j))&&(name.charAt(i)!=' '))
				{
					hs.add(name.charAt(i));
				}
			}
		}
System.out.println("The duplicates in name are: "+hs);
	}

}

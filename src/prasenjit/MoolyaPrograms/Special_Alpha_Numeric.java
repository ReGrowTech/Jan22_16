package prasenjit.MoolyaPrograms;

public class Special_Alpha_Numeric {

	public static void main(String[] args) {
		String str ="abd1234$";
		String num="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=num+str.charAt(i);
			}
		}
		System.out.println(num);

	}

}

package basic_java_programs;

public class Prime1to100 {

	public static void main(String[] args) 
	{
		System.out.println("Prime numbers between 1 to 100 are :");
		for(int num=2;num<=100;num++)
		{
			boolean prime=true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					prime=false;
					break;
				}
			}
			if(prime)
				System.out.print(num+"\t");
		}
	}

}

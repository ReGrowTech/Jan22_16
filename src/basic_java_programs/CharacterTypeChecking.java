//capsule 6 question 1 
//WAP to check whether the given character is an alphabet
package basic_java_programs;
import java.util.Scanner;
public class CharacterTypeChecking
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a character : ");
	if(Character.isLetter(sc.next().charAt(0)))
		System.out.println("Entered Character is an Alphabet");
	else
		System.out.println("Entered Character is not an Alphabet");
	System.out.println("------RUN 2-----");
	System.out.print("Enter a character : ");
	char ch=sc.next().charAt(0);
	if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		System.out.println("Entered Character is an Alphabet");
	else
		System.out.println("Entered Character is not an Alphabet");
	sc.close();
	

	}

}

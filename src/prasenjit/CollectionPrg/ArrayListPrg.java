
//WAP in java to sort the arraylist in descending order
package prasenjit.CollectionPrg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListPrg {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size =sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<size;i++)
		{
			System.out.print("Enter element "+i+" : ");
			al.add(sc.nextInt());
		}
		System.out.println("Entered Array List ");
		for(int a : al)
			System.out.println(a);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Array List in Descending Order : ");
		for(int a : al)
			System.out.println(a);
		sc.close();

	}

}

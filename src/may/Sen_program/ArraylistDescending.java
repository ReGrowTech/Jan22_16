package may.Sen_program;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArraylistDescending
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(100);
		al.add(20);
		al.add(300);
		al.add(35);
		Collections.sort(al,Collections.reverseOrder());
		java.util.Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

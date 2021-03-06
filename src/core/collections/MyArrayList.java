package core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList
{

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("Z");
		list.add("K");
		list.add("F");
		list.add("O");

		System.out.println(list.get(1));

		list.remove(1);

		for (String s : list)
		{
			System.out.print(s + " ");
		}
		System.out.println();

		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		Iterator<String> iter2 = list.iterator();
		while (iter2.hasNext())
		{
			System.out.print(iter2.next() + " ");
		}
	}

}

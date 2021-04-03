package Practice;

import java.util.*;

public class Collection_Arreylist {

	public static void main(String[] args) {

		ArrayList<Integer> ls = new ArrayList<Integer>();

		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);

		for (int i = 0; i < ls.size(); i++) {

			System.out.print(ls.get(i));
			System.out.print(", ");

		}

		System.out.println("\n");
		System.out.println(ls.contains(7));

		//
		ls.set(2, 20);
		ls.add(6, 10);

		System.out.println(ls.contains(10));
		System.out.println("\n");
		System.out.println(ls.indexOf(20));

		//
		for (int i = 0; i < ls.size(); i++) {

			System.out.print(ls.get(i));
			System.out.print(", ");

		}
		System.out.println("\n");
		System.out.println(ls.size());

		ls.remove(6);

		//
		for (int i = 0; i < ls.size(); i++) {

			System.out.print(ls.get(i));
			System.out.print(", ");

		}

	}

}

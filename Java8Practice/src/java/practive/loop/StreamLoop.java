package java.practive.loop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamLoop {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("hello");
		list.add("hell");
		list.add("hel");
		list.add("he");
		list.add("h");

		// Comparator<String> str = new Comparator<String>() {
		//
		// @Override
		// public int compare(String o1, String o2) {
		// if (01 > 02) {
		// return 1;
		// } else {
		// return -1;
		// }
		// }
		// };
		// System.out.println(list.stream().sorted(str));
	}

}

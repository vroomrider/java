package com.java.practice.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<?> li = new ArrayList<>();
		 li.add(1, null);
//		 li.add(2, "");
//		 li.add(3, Integer.parseInt("123"));
		 li.add(null);
		System.out.println(li);
		
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(null);
		System.out.println(list);

	}
}

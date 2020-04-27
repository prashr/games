package com.prash.games.coll;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("123");
		list.add("456");
		list.add("789");
		list.add("abc");
		list.add("def");
		list.add("abc");
		list.add("123");
		
		
		
		System.out.println(list);
		
		boolean str = list.offerFirst("xyz");
		System.out.println(str);
		System.out.println(list);

	}

}

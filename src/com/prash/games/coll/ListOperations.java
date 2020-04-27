package com.prash.games.coll;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
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
		list.add("def");
		list.add("def");
		list.add("def");
		list.add("abc");
		list.add("123");
		list.add("raj");
		list.add("pra");
		
		
		//System.out.println(list.indexOf("b"));
		List ll = (List<String>) ((ArrayList<String>)list).clone();
		System.out.println(list);
		System.out.println(ll);
		
		 list.remove(10); 
		 list.remove(1); 
		 list.remove("c");
		 
		
		//System.out.println(list.indexOf("def"));
		
		 System.out.println(list);
		 ll.remove(10); 
		 ll.remove(1); 
		 ll.remove("c");
		System.out.println(ll);

	}

}

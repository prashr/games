package com.prash.games.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("123");
		set.add("456");
		set.add("789");
		boolean i = set.add("111");
		set.add("abc");
		set.add("def");
		set.add("def");
		boolean j = set.contains("def");
		set.add("def");
		set.add("def");
		set.add("abc");
		set.add("123");
		set.add("raj");
		set.add("pra");
		System.out.println(set);
		Set<String> st = set.headSet("abc");
		Set<String> st1 = set.tailSet("abc");
		
		System.out.println(st);
		System.out.println(st1);
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.addAll(set);
		list.addAll(st);
		
		System.out.println(list);
		
		
		
		
		
		
		//System.out.println(i);
		//System.out.println(j);
		
		

	}

}

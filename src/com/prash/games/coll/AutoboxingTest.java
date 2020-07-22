package com.prash.games.coll;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		long  ii =3l;
		short sh = 11;
		char ch = 'c';
		
		Integer inte = new Integer(22);
		Long ll = null;
		Short sha = null;
		
		System.out.println(inte);
		//Auto Boxing
		inte = i;
		System.out.println(inte);
		//Auto-unboxing. 		
		i = inte;
		
		List<Integer>  list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);

	}

}

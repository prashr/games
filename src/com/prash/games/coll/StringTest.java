package com.prash.games.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(11);
		String str = new String("Ramesh");
		String str1 = "abcd";
		String str2 = str1.concat("def");
		
		System.out.println(str1);
		System.out.println(str2);
		
		StringBuffer sb = null;
		StringBuilder sbb = new StringBuilder("abcd");
		sbb.append("def").append("gh").append("ijk");
		
		String str10 = sbb.toString();
		
		char[] charr = str10.toCharArray();
		
		
		//sbb = new StringBuilder("xyz");
		
		System.out.println(sbb);
		
		
		
		
		
		
		
		

	}

}

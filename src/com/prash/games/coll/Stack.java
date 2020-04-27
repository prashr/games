package com.prash.games.coll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Stack {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
 		LinkedList<String> list = new LinkedList<String>();
 		String input = "r";
 		int size = 0;
 		
 		while(!input.equals("q")) {
 			System.out.println(" Please enter the operation");
 			input = reader.readLine();
 			
 			if(input.equals("push")) {
 				System.out.println(" Please enter the element to push");
 	 			String str = reader.readLine();
 	 			if(size <= 10) {
 	 				list.push(str);
 	 				size++;
 	 			} else {
 	 				System.out.println("Stack is full");
 	 			}
 				
 			}
 			
 			if(input.equals("pop")) {
 				if(size > 0) {
 					String str = list.pop();
 					size--;
 					System.out.println("Element poped " + str);
 				} else {
 					System.out.println("Stack is empty");
 				}
 			}
 			System.out.println(list);
 		}
 		
		

		

		//boolean str = list.offerFirst("xyz");
		//System.out.println(str);
		System.out.println("Thanks");

	}

}

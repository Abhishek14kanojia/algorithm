package org.Algorithms;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("first string");
		String st1 = sc.next();
		
		System.out.println("Second string");
		String st2 = sc.next();
		
		st1= st1.toLowerCase();
		st2= st2.toLowerCase();
		
		if(st1.length() == st2.length()) {
			char[] charArray1 = st1.toCharArray();
			char[] charArray2 = st2.toCharArray();
		
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result) {
				System.out.println(st1 + " " + st2 + "this is anagram" );
			}else {
				System.out.println(st1 + " " + st2 + " this is not anagram");
			}
		}
		
		
	}

}

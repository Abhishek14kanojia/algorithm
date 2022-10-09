package org.Algorithms;

import java.util.*;
public class Insertion {
 
	static Scanner sc = new Scanner(System.in);
	
	static public void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && (key.compareTo(array[j]) < 0)) {
                array[j + 1] = array[j];
                --j;
            } 
            array[j + 1] = key;
        }
     }
	 static public void printString(String[] strings) {
	        for (int i = 0; i < strings.length; i++) {
	            System.out.println("string at index " + i + " is " + strings[i]);
	        }
	    }static public void scanString(String[] strings) {
	        for (int i = 0; i < strings.length; i++) {
	            System.out.printf("Enter the string at index :%d\n", i);
	            strings[i] = sc.nextLine();
	        }
	    }

	    public static void main(String[] args) {
	        String[] strings = new String[5];
	        scanString(strings);
	      
	        printString(strings);
	        insertionSort(strings);
	       
	        printString(strings);
	    }
	}

	

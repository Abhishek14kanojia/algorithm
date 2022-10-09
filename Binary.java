package org.Algorithms;

import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Binary binaryObj = new Binary();
        Scanner scanner = new Scanner(System.in);
        String[] wordList = { "hello", "there", "this", "is", "a", "search", "program" };
        Arrays.sort(wordList);
        System.out.println("List of Words :");
        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word you want to search");
        String searchName = scanner.nextLine();
        scanner.close();
        int result = binaryObj.binarySearch(wordList, searchName);

        if (result == -1)
            System.out.println("word is not present in the list");
        else
            System.out.println(" word is present " + "index " + result);
    }

    public int binarySearch(String[] wordList, String searchName) {
        int start = 0, length = wordList.length - 1;
        while (start <= length) {
            int middle = start + (length - start) / 2;
            int result = searchName.compareTo(wordList[middle]);
            if (result == 0)
                return middle;
            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
	}

}

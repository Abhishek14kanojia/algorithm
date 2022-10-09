package org.Algorithms;
import java.util.*;

public class FindNumber {

	   static Scanner scannerObject = new Scanner(System.in);

	    public void findNumber(int low, int high) {

	        if (low == high) {
	            System.out.println("Your Number is : " + low);
	            System.out.println("Intermediary Number is: " + (low - 1) + " and " + (low + 1));
	            return;
	        }

	        int middle = (low + high) / 2;
	        int choice;
	        System.out.println("enter first number is between : " + low + " & " + middle);
	        System.out.println("Enter second number is between : " + (middle + 1) + " & " + high);
	        choice = scannerObject.nextInt();

	        if (choice == 1) {
	            findNumber(low, middle);
	        } else {
	            findNumber(middle + 1, high);
	        }
	    }

	    public static void main(String[] args) {

	        FindNumber num = new FindNumber();
	        System.out.println("Think of a number between 0 and 100");

	        int N = scannerObject.nextInt();
	        num.findNumber(0, N);
	        scannerObject.close();

	    }
}

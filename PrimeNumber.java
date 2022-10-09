package org.Algorithms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber primeNumber = new PrimeNumber();
        int flag = 0;
        System.out.println("Prime Numbers range is 0 - 1000");
        int first = 0;
        int second = 1000;
        for (int i = first + 1; i < second; ++i) {
            flag = primeNumber.checkPrimeNumber(i);

            if (flag == 1)
                System.out.print(i + " ");
        }
    }
    public int checkPrimeNumber(int num) {
        int flag = 1;
        for (int j = 2; j <= num / 2; ++j) {
            if (num % j == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }

	}



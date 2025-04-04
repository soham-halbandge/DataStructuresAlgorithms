package problems;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverseNumber = 0;
        int originalNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }

        if (reverseNumber == originalNumber) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}


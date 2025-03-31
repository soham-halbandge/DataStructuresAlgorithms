package problems;

import java.util.Scanner;

public class AlphabetOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("It is a character");
        } else if (ch >= '0' && ch <= '9'){
            System.out.println("It is a digit");
        } else {
            System.out.println("It is neither a digit nor an alphabet");
        }
    }
}
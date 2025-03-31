package problems;

import java.util.Scanner;

public class OddNumbersOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int endLimit = sc.nextInt();

        for (int i = 1; i <= endLimit; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

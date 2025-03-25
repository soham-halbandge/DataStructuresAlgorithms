package java_fundamentals.week2;

import java.util.Scanner;

public class DivisibleBy7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 7 == 0) {
            System.out.println("Divisible by 7");
        }
    }

}

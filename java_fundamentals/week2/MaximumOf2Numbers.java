package java_fundamentals.week2;

import java.util.Scanner;

public class MaximumOf2Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println(num1 + " is maximum");
        } else {
            System.out.println(num2 + " is maximum");
        }

    }

}

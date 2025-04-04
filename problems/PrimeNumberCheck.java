package problems;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean flag = true;
        if (number == 1) System.out.println("Not a Prime Number");
        else if (number == 2) System.out.println("Prime Number");
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) System.out.println("Prime Number");
            else System.out.println("Not a Prime Number");
        }
    }
}

package problems;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        float average = (float)(sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        System.out.println(average);
    }
}

package problems;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // this is to take character as an input
        int num = sc.nextInt();

        System.out.println(ch);
        System.out.println(num);
    }
}
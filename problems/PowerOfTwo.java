package problems;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

//        while (number%2!=1) {
//            if (number%2!=0) {
//                break;
//            }
//            else if (number%2==0) {
//                number=number/2;
//            }
//        }

        while (number%2==0) {
            number=number/2;
        }

        if (number==1) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }
    }
}

package java_fundamentals.week1;

import java.util.Scanner; // this is how we import Scanner class from util package

public class UserInput {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // to get user input 
        // we need to import Scanner package

        // object created
        Scanner sc = new Scanner(System.in);

        // functions
        int num = sc.nextInt(); // takes an integer input and store it in variable num
        long longNum = sc.nextLong(); // takes long as in input
        float floatNum = sc.nextFloat(); // takes float as in input
        double doubleNum = sc.nextDouble(); // takes double as in input
        String word = sc.next(); // takes only one word as an input (without spaces)
        
        sc.nextLine(); // consumes the leftover newline before reading sentence
        String sentence = sc.nextLine(); // takes sentence as input (with spaces) 
        boolean bool = sc.nextBoolean(); // takes boolean as in input

        System.out.println(num);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(word);
        System.out.println(sentence);
        System.out.println(bool);
    }

}

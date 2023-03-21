package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class O1OddOrEven {
    //Main method
    public static void main(String[] args) {
        //Create an obj of scanner
        Scanner obj = new Scanner(System.in);
        //Print statement
        System.out.print("Enter a number: ");
        //create a variable to store value
        int num = obj.nextInt();
        //call instance method
        number(num);
        // close scanner
        obj.close();
    }

    //Instance method
    public static void number(int num) {
        //Use ternary operator
        String x = (num % 2 == 0) ? "Enter number is Even" : "Enter number is odd";
        //Print
        System.out.println(x);

    }


}

package homeworkweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO
 */
public class O16PositiveNegativeOrZero {
    //Declare a main method
    public static void main(String[] args) {
        int num;
        //Create an scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:    ");
        num = scan.nextInt();
        //Calling instance method
        O16PositiveNegativeOrZero obj = new O16PositiveNegativeOrZero();
        obj.enterNumber(num);
        //Close scanner
        scan.close();
    }
    //Declare instance method with params
        public void enterNumber(int num){


        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero");
        }
    }

}

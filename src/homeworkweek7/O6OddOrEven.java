package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class O6OddOrEven {
    //Declare main method
    public static void main(String[] args) {

//Declare a scanner
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        //System.out.print("Enter a number: ");
        int num = obj.nextInt();
        number(num);//Calling Instance method

        //number(num);
        obj.close();

    }

    // Instance method
    public static void number(int num) {
        // Even and odd if condition
        if (num % 2 == 0)
            System.out.print(num + " is even");
        else
            System.out.print(num + " is odd");
    }

}


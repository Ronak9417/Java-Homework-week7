package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class O2LeapYear {

    //Main method
    public static void main(String[] args) {
        //Create a scanner
        Scanner xyz = new Scanner(System.in);
        //Print
        System.out.print("Insert the year : ");
        //Create a variable to store value
        int year = xyz.nextInt();
        // Call instance method
        year(year);
        // close scanner
        xyz.close();

    }

    //Instance method
    public static void year(int year) {

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

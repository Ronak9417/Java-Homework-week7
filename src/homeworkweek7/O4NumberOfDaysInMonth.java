package homeworkweek7;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
public class O4NumberOfDaysInMonth {
    // main method
    public static void main(String[] args) {
        //create a scanner
        Scanner sc = new Scanner(System.in);
        //Declare print statement
        System.out.print(" Enter year between 1 to 9999 : ");
        int year = sc.nextInt();
        //Declare print statement
        System.out.print(" Enter month between 1 to 12 : ");
        int month = sc.nextInt();

        O4NumberOfDaysInMonth obj = new O4NumberOfDaysInMonth();
        System.out.println("");//Calling instance method
        obj.isLeapYear(year);
        System.out.println("");//Calling instance method
        obj.getDaysInMonth(year, month);
        //Close scanner
        sc.close();
    }

    //Instance method
    public void isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                System.out.println(year + " year is Leap year ");
            } else {
                System.out.println(year + " year is not leap year");
            }
        } else {
            System.out.println("False since the parameter is not in the range (1-9999)");
        }
    }

    //Instance method
    public void getDaysInMonth(int year, int month) {

        switch (month) {
            case 1:
                System.out.println(" 31 Days in January  " + year);
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29 Days in February " + year);
                } else {
                    System.out.println("28 Days in February " + year);
                }
                break;

            case 3:
                System.out.println(" 31 Days in March " + year);
                break;

            case 4:
                System.out.println(" 30 Days in April " + year);
                break;
            case 5:
                System.out.println(" 31 Days in May " + year);
                break;

            case 6:
                System.out.println(" 30 Days in June " + year);
                break;

            case 7:
                System.out.println(" 31 Days in July " + year);
                break;
            case 8:
                System.out.println(" 31 Days in August " + year);
                break;

            case 9:
                System.out.println(" 30 Days in September " + year);
                break;
            case 10:
                System.out.println(" 31 Days in October " + year);
                break;

            case 11:
                System.out.println(" 30 Days in November " + year);
                break;
            case 12:
                System.out.println(" 31 Days in December " + year);
                break;
            default:
                System.out.println("Enter Valid month number between 1 to 12 ");
        }

    }
}


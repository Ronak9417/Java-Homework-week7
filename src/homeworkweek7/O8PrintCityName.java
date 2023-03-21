package homeworkweek7;


import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class O8PrintCityName {

    //Declare main method
    public static void main(String[] args) {

        //Create a scanner
        Scanner sc = new Scanner(System.in);
        //Print statement
        System.out.println("Enter any alphabet from A to F : ");
        String xyz = sc.nextLine();
        O8PrintCityName obj = new O8PrintCityName();
        obj.city(xyz);//Calling instance method
        //close scanner
        sc.close();
    }

    //Declare instance method
    public void city(String xyz) {

        if (xyz.equals("A")) {
            System.out.println("Ahmedabad is my city");
        } else if (xyz.equals("B")) {
            System.out.println("Bombay is my city");
        } else if (xyz.equals("C")) {
            System.out.println("Chandigarh is my city");
        } else if (xyz.equals("D")) {
            System.out.println("Delhi is my city");
        } else if (xyz.equals("E")) {
            System.out.println("Edinburgh is my city");
        } else if (xyz.equals("F")) {
            System.out.println("Frognal is my city");
        } else {
            System.out.println("Invalid entry");

        }
    }
}



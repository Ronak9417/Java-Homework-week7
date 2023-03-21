package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch) if
 * any other alphabet should be invalid entry
 */
public class O9PrintCityNameAToF {
    //Declare main method
    public static void main(String[] args) {
        String city;
        //Create a scanner
        Scanner mySc = new Scanner(System.in);
        //Print statement
        System.out.println("Enter any character from A to F:   ");
        city = mySc.nextLine();
        String city1 = city.toUpperCase();

        O9PrintCityNameAToF obj = new O9PrintCityNameAToF();
        obj.cityName(city1);//Calling instance method

        //Close scanner
        mySc.close();

    }

    //Instance method
    public void cityName(String city1) {
        // Switch statement
        switch (city1) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Chandigarh");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Flognal");
                break;
            default:
                System.out.println("Invalid entry");

        }

    }
}


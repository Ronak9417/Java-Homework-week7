package homeworkweek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class O12InputValueIsNumberOrSymbol {
    //Declare a main method
    public static void main(String[] args) {
//Create a scanner
        Scanner scannerOne = new Scanner(System.in);
        System.out.println(" Enter any character:  ");
        char ch = scannerOne.next().charAt(0);
        //Calling an instance method
        O12InputValueIsNumberOrSymbol xyz = new O12InputValueIsNumberOrSymbol();
        xyz.input(ch);
//Close scanner
        scannerOne.close();

    }

    //Declare an instance method
    public void input(Character ch) {
        char abc = ch;
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet");
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a digit");
        } else {

            System.out.println(ch + " is a special character");
        }

    }
}


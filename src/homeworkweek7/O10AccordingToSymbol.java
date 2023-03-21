package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class O10AccordingToSymbol {
    //Declare main method
    public static void main(String[] args) {
        //Create a scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = s.nextInt();
        System.out.println("Input second number");
        int num2 = s.nextInt();
        System.out.println("Enter your symbol:");
        String ch = s.next();
        //Calling instance method
        O10AccordingToSymbol obj = new O10AccordingToSymbol();
        obj.symbol(ch,num1,num2);
        //Close scanner
        s.close();

    }
    // Declare an Instance method
    public void symbol(String ch,double num1,double num2){

        if(ch.equals("+"))
        {
            double sum=num1+num2;
            System.out.println("Addition of two numbers: " +sum);
        }else if(ch.equals("-"))
        {
            double sub=num1-num2;
            System.out.println("Difference of two numbers: " +sub);
        }else if(ch.equals("*"))
        {
            double mul=num1*num2;
            System.out.println("Division between two numbers: " +mul);
        }else if(ch.equals("/"))
        {
            double div=num1/num2;
            System.out.println("Division of two numbers: " +div);
        }

    }
}

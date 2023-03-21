package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class O3MarkSheet {

    //main method
    public static void main(String[] args) {
        String result;
        String grade;
        // create a scanner
        Scanner s = new Scanner(System.in);
        //print
        System.out.println("Enter Student name");
        String name = s.nextLine();
        //print
        System.out.println("Enter Roll number");
        int rollNo = s.nextInt();
        //print
        System.out.println("Enter Maths marks");
        double maths = s.nextDouble();
        //print
        System.out.println("Enter English marks");
        double english = s.nextDouble();
        //print
        System.out.println("Enter Science marks");

        double science = s.nextDouble();
        double total = maths + english + science;
        double percentage = (total / 300) * 100;
        //Declare if statement
        if (maths < 35 || science < 35 || english < 35) {
            result = "fail";
        } else {
            result = "pass";
        }
        if ((maths >= 0 && maths <= 100) && (english >= 0 && english <= 100) && (science >= 0 && science <= 100)) {
            if (percentage >= 80) {
                grade = "A+" ;
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
            //Declare print statement
            System.out.println("|----------------------------|");
            System.out.println("|           Mark Sheet       |");
            System.out.println("|----------------------------|");
            System.out.println("|    Name:" + name + "       |");
            System.out.println("|    Roll No:" + rollNo + "  |");
            System.out.println("|----------------------------|");
            System.out.println("|    Subject: Marks          |");
            System.out.println("|----------------------------|");
            System.out.println("|    Maths:" + maths + "              |");
            System.out.println("|    Science:" + science + "            |");
            System.out.println("|    English:" + english + "            |");
            System.out.println("|----------------------------|");
            System.out.println("|    Total:" + total + "     |");
            System.out.println("|----------------------------|");
            System.out.println("|    Percentage:" + percentage + " |");
            System.out.println("|    Result:" + result + "   |");
            System.out.println("|    Grade:" + grade + "     |");
            System.out.println("|----------------------------|");
        } else {
            System.out.println("Invalid input, Marks should be between 0 to 100");
        }

    }

}






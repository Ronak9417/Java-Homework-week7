package homeworkweek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class O11NumberBetween1To100 {
    //Declare main method
    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        //Calling instance method
        O11NumberBetween1To100 obj = new O11NumberBetween1To100();
        //Print statement
        System.out.println("********* : ");
        obj.printNum(x);
        //Print statement
        System.out.println("********* : ");
        obj.calculation(y);

    }

    //Create an instance method
    public void printNum(int num) {
        if (num <= 100) {
            System.out.println(num + " ");
            printNum(num + 3);
        }
    }

    //Create an instance method
    public void calculation(int y) {
        if (y <= 100) {
            System.out.println(y + " ");
            calculation(y + 5);
        }
    }
}

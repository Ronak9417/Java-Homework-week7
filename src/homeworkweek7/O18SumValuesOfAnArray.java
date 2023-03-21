package homeworkweek7;

/**
 * Write a Java program to sum values of an array
 */
public class O18SumValuesOfAnArray {

//Declare main method
    public static void main(String[] args) {
// Calling instance method
        O18SumValuesOfAnArray obj = new O18SumValuesOfAnArray();
        obj.number();

    }
    //Declare instance method
    public void number(){
        int[] a1 = {
                10, 25, 30, 34, 40,43, 56, 80, 90, 100, 110, 120, 130, 140};

        int sum = 0;
        for (int abc : a1) {
            sum = sum + abc;

        }
        System.out.println(" Sum value of an Array is:   " + sum);
    }
}

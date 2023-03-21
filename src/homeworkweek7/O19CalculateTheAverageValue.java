package homeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class O19CalculateTheAverageValue {
//Declare main method
    public static void main(String[] args) {
//Calling an instance method
        O19CalculateTheAverageValue obj = new O19CalculateTheAverageValue();
        obj.average();
    }
    // Declare an instance without params
    public void average() {
        int sum = 0;
        int[] my = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int j : my) sum = sum + j;

        double average = sum / my.length;
        System.out.println("Average value of the array elements is : " + average);
        System.out.println();
    }


}

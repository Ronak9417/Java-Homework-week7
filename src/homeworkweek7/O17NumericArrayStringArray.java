package homeworkweek7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class O17NumericArrayStringArray {
    //Declare a main method
    public static void main(String[] args) {
    // Declare instance method
        O17NumericArrayStringArray obj = new O17NumericArrayStringArray();
        obj.allArray();
    }
//  Declare an instance method
    public void allArray() {
        int[] a1 = {
                14, 32, 30, 7, 12, 38, 58, 97, 10, 65, 130, 120, 40, 50, 25};


        String[] a2 = {
                "Vishnu", "Sankar", "Parvati", "Laxmi", "Narayan", "Ganesh"};

        System.out.println("Original numeric array:  " + Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println("Sorted numeric array:  " + Arrays.toString(a1));

        System.out.println("Original numeric array:  " + Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println("Sorted numeric array:  " + Arrays.toString(a2));
    }

}

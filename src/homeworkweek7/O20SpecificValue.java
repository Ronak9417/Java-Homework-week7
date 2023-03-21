package homeworkweek7;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class O20SpecificValue {
//Declare main method
    public static boolean contains(int[] arr, int item) {


        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    //Declare static method
    public static void main(String[] args) {

        int[] my_array1 = {5,2,6,7,9,10,12,46,67,89 };
        System.out.println(contains(my_array1, 89));
        System.out.println(contains(my_array1,100 ));
    }


}

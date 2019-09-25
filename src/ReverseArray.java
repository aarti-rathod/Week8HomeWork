

/**
 * Write a Java program to reverse an array of integer values.
 *
 * Created by JANVI on 22/09/2019.
 */
/*

 */
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] my_array1 = {
                17, 20, 18, 14, 20,
                18, 58, 14, 72, 65,
                14, 21, 57, 25};
        System.out.println(" Array Before : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Reverse Array : "+Arrays.toString(my_array1));
    }
}

/**
 * Created by JANVI on 21/09/2019.
 */
/*
 Write a program to compare two array and its elements are same or not?
 */
import java.util.Arrays;
public class CheckArray {

    public static void main(String[] args) {

        int a[] = {1,2,3,4};
        int s[] = {1,2,3,4};

        if(Arrays.equals(a,s)){
            System.out.println("------: Array Checks :------ ");

            System.out.println("Same Array");
        }
        else {
            System.out.println("Not Same");
        }

    }
}





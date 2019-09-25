/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to display the number rhombus structure. Go to the editor
Input the number: 7
 */
//Write a Java program to display the following character rhombus structure.

import java.util.*;
public class RohumbusStructure {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) { //Row

            for (int spc = n - no_of_spaces; spc > 0; spc--) { //Space
                System.out.print(" ");
            }


            //
            if (i < n) {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) {   // Column

                System.out.print(start); //Print


                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}

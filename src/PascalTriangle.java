/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to display Pascal's triangle.
Input number of rows: 5


1
1 1
1 2 1//-------------
1 3 3 1
1 4 6 4 1
 */
//11. Write a Java program to display Pascal's triangle.
//Input number of rows: 5

import java.util.*;
public class PascalTriangle {

    public static void main(String[] args) {

Scanner s = new Scanner(System.in);

        System.out.print("Enter The Row : ");
        //row , //column

        int a = s.nextInt(); //row
        int b = 1;
        //-------------



        for(int i=0; i<a; i++){

            for(int k =0;k<a-i+1;k++){
                System.out.print(" ");
            }

            for(int j = 0; j<=i;j++){ //i =2 //j=1


                if(i==0 || j ==0 ){

                    b=1;

                }
                else{

                    b=b*(i-j+1)/j;

                }




                System.out.print( b+ " ");

            }
            System.out.println(" ");     // next line
        }




    }

}

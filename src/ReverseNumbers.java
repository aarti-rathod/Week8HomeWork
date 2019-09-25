/**
 * Created by JANVI on 21/09/2019.
 *
 * Write a program to reverse the given number?
 */
//1. Write a program to reverse the given number?

import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sr=new Scanner(System.in);
        int a=sr.nextInt();
        int revs=0;
        //a=1234   ....  "%" , "/"

        //1234   4

        while(a != 0) {
            int digit = a % 10; //4 //3 //2 //1
            revs = revs * 10 + digit; //4 //43 //432//4321
            a /= 10; //123 //12 //1 //0
        }

        System.out.println("Reverse Number : "+revs);


    }
}

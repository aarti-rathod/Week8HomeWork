/**
 * Created by JANVI on 22/09/2019.
 */

/*
7. Write a program to split the string?
 */
//Write a program to split the string?

import java.util.Scanner;
public class SplitString {

    public static void main(String[] args) {

        Scanner str  = new Scanner(System.in);

        System.out.print("Enter A Sentence : ");
        //String

        String s1 = str.nextLine();

        //"This is Prime It Classes";

        String a[]= s1.split("\\s");

//        for(int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//        }

        System.out.println("------: After Split The Sentence :-------- ");
        for(String w:a){
            System.out.println(w);
        }




    }
}

/**
 * Created by JANVI on 21/09/2019.
 */

/*
Write a program to compare two strings?
 */
public class CompareString {
    public static void main(String[] args){

        String a= "Janvi";
        String b= "Janvi";

        System.out.println("------  :String Checks : -------");
        if(a.equalsIgnoreCase(b)){   //Used String Method To Check String
            System.out.println("Same");
        }

        else {
            System.out.println("Not Same ");
        }

   }

}

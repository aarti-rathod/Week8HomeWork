/**
 * Created by JANVI on 21/09/2019.
 */
//Write a program to reverse the string?

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {


        Scanner a = new Scanner(System.in);
        System.out.print("Enter The Name : ");
        String s=a.next();

        //AARTI


        char ch[]=s.toCharArray();
        //{A,A,R,T,I}



        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }

        System.out.println("-----: Reverse String :----");
        System.out.println(rev);

    }
}

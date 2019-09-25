/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to generate random integers in a specific range.
 */
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );   //created objects

        System.out.print("Enter the starting number : ");
        int StrNum = sc.nextInt();
        //25
        System.out.print("Enter the ending number : ");
        int EnNum = sc.nextInt();
        //26
        int random_num = StrNum + (int)(Math.random() * ((StrNum - EnNum) + 1));
                        //25 + n * -24
        System.out.println(random_num);

    }
}

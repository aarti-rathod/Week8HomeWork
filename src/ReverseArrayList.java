

/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to reverse elements in a array list.
 */
//20. Write a Java program to reverse elements in a array list.

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {


        ArrayList <String> myArr = new ArrayList<>();

        myArr.add(0,"A");
        myArr.add(1,"B");
        myArr.add(2,"C");
        myArr.add(3,"D");
        myArr.add(4,"E");

        System.out.println("-------Array Before Reverse--------");
        System.out.println(myArr);

        System.out.println("------------: Array After Reverse :---------------");
        Collections.reverse(myArr);  //Reverse The Array
        System.out.println(myArr);



    }
}

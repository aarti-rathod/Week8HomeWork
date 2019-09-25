/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to empty an array list
 */
//Write a Java program to empty an array list

import java.util.ArrayList;
public class EmptyArrayList {
    public static void main(String[] args) {

        ArrayList <String> EmtArr = new ArrayList<>();

        EmtArr.add(0,"A");
        EmtArr.add(1,"R");
        EmtArr.add(2,"R");
        EmtArr.add(3,"A");
        EmtArr.add(4,"Y");

        System.out.println("----- : Display The Array : --------");
        System.out.println(EmtArr);

        System.out.println("----------: Empty Array :----------");
        EmtArr.removeAll(EmtArr);   //Remove All Array Method

        System.out.println(EmtArr);



    }
}

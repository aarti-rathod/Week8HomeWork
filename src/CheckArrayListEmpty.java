import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to test an array list is empty or not.
 */
public class CheckArrayListEmpty {
    public static void main(String[] args){

        AbstractList <String> objArr = new ArrayList<>();

        AbstractList<String> empArr = new ArrayList<>();


        objArr.add(0,"H");
        objArr.add(1,"I");
        objArr.add(2,"J");
        objArr.add(3,"K");
        objArr.add(4,"L");
        objArr.add(5,"M");
        objArr.add(6,"N");
        objArr.add(7,"O");


        if(objArr.isEmpty()){
            System.out.println("-----Array 1 is Empty-------");
        }
        else {
            System.out.println("--: Array 1 is :---");
            System.out.println(objArr);
        }


        System.out.println("------------------------------------------------------");

        if (empArr.isEmpty()){
            System.out.println("-----Array 2 is Empty ------");
            }

            else {
            System.out.println("--: Array 2 is :---");
            System.out.println(empArr);
            }

    }
}

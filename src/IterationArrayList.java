import java.util.ArrayList;

/**
 *
 * Created by JANVI on 22/09/2019.
 */

/*
Write a Java program to iterate through all elements in a array list.
 */
import java.util.*;
public class IterationArrayList {
    public static void main(String[] args){

        String j = "";
        ArrayList<String> myArray= new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for(int i=0; i<5 ;i++){
            System.out.print("  Enter   "   + i+1 +   " city Name : ");
            j=s.next();
            myArray.add(i,j);

        }

        System.out.println("------------------------------------------------");
        System.out.println(" :   List Of City Stored In The Array  :");
        for(String r : myArray){
            System.out.println(r);
        }



    }
}

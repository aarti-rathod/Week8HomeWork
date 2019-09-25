
//Write a Java program to create a new array list, add some colours (string) and

/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection.
 */
import java.util.ArrayList;

public class ArrayListColurrs {
    public static void main(String[] args) {

        ArrayList<String> colour= new ArrayList<>();


       // String colour1[] = {"Blue","Grey","Pink","Black"};

        colour.add(0,"Blue");//
        colour.add(1,"Grey");
        colour.add(2,"Pink");
        colour.add(3,"Black");

        System.out.println("---------: List Of Array Colours :----------");
        for (String s:colour) {
            System.out.println(s);
        }

   }
}

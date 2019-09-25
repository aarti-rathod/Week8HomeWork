import java.util.ArrayList;

/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class RetriveArrayList {
    public static void main(String[] args) {


        //ArrayList<String> myArray= new ArrayList<>();
        ArrayList<String> ret = new ArrayList<>();

        ret.add(0,"");
        ret.add(1,"");
        ret.add(2,"");
        ret.add(3,"");
        ret.add(4,"");
        ret.add(5,"");

        System.out.println("---------------My Array------------------");
        for (String r:ret){
            System.out.println(r);
        }

        System.out.println("-------------Retrive 0 and 1 From List ----------");
        System.out.println(ret.get(0));
        System.out.println(ret.get(1));




        }




    }


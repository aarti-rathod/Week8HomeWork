package Constructor;

import java.util.Scanner;

/**
 * Created by JANVI on 23/09/2019.
 */
public class CalculatorConstructor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Value : ");
        int a  = s.nextInt();

        System.out.print("Enter Sencond Value : ");
        int b = s.nextInt();

        System.out.print("Enter Operation :");
        char as = s.next().charAt(0);




        A obj1 ;
        new A();   // A obj = new A();
         new A(a,b,as); //A obj =  new A(a,b,as);



    }


}


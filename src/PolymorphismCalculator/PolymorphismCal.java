package PolymorphismCalculator;

/**
 * Created by JANVI on 23/09/2019.
 */
import java.util.Scanner;
public class PolymorphismCal {

    public static void main(String[] args) {

        Scanner obj  = new Scanner(System.in);

        System.out.print("Enter First Value : ");
        int a  = obj.nextInt();

        System.out.print("Enter Second Value :");
        int b= obj.nextInt();

        System.out.print("Enter Operation :");
        char sym = obj.next().charAt(0);

        double x  = a;

        if(sym== '+') {
            operation(a, b, sym); //Additions
        }
       else if(sym=='-') {
            operation(sym, b, a); //Substraction
        }
       else if(sym=='*') {
            operation(b, sym, a); //multiplication
        }
        else if(sym=='/') {
           operation(sym, x, b); //Division
        }
        else {
            System.out.println(" Invalid Entry : ");
        }

    }


    static void operation(int a, int b, char s){

            System.out.println("Addition is : "+ (a+b));

    }

   static void operation(char s , int a,int b ) {

       System.out.println("Substraction is : " + (a - b));
   }

    static void operation (int b , char s , int a){

            System.out.println("Multiplication is : "+ (a*b));

    }

    static void operation(char s , double a, int b){

            System.out.println("Division is : "+ (a/b));

    }



}

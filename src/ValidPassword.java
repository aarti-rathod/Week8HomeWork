/**
 //IF ... Else .. Boolean...
 Password rules:
 A password must have at least ten characters
 A password consists of only letters and digits.
 A password must contain at least two digits.

 //-------------------------output----------------------//

 Expected Output:
 1. A password must have at least eight characters.
 2. A password consists of only letters and digits.
 3. A password must contain at least two digits
 password size : 8-10
 Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
 Password is valid: abcd1234
 * Created by JANVI on 22/09/2019.
 */
//Write a Java method to check whether a string is a valid password

import java.util.*;
public class ValidPassword {

     public static void main(String[] args) {

         ValidPassword objvb = new ValidPassword();
         Scanner k = new Scanner(System.in);


         System.out.println("A password must have at least eight characters");
         System.out.println("A password consists of only letters and digit ");
         System.out.println("A password must contain at least two digits");

         System.out.print("Enter The Password : ");

         String a = k.nextLine();



         if(ChkPwd(a)){
             System.out.println("Valid Password");
         }
         else {
             System.out.println("Invalid Password");
         }

         }



         public static boolean ChkPwd(String a){

             String x ;
             int n=0;


             //1. Check Length Of Password
             if(a.length()<8 || a.length()>10){
                 return false;
             }

             //2. Password Between a to z and 1 to 9 :


                 for (int i = 0; i < a.length(); i++) {
                     x = a.toLowerCase();

                     if (!Character.isLetterOrDigit(x.charAt(i))) { //x<='a'&& x>='z'
                         return false;
                     }

                     if(Character.isDigit(x.charAt(i))) {
                         n++;
                     }

                 }
             if (n < 2) {
                 return false;
             }


             return true;
         }






   }





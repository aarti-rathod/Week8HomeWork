
package InheritanceHW;
import java.util.Scanner;
/**
 * Created by JANVI on 23/09/2019.
 */


     //Child Class

    //    ---------Left(Child)--------"Extends"----------Right(Parent)----------

public class InheritanceCalculator extends Logic {

    public InheritanceCalculator(int x, int y) {
        super(x, y);
    }

    public static void main(String[] args) {

    Scanner sr=new Scanner(System.in);
        System.out.print("Enter First Value:" );
        int a=sr.nextInt();
        System.out.print("Enter Second Value:");
        int b=sr.nextInt();


        InheritanceCalculator s = new InheritanceCalculator(a,b);  //Created Constructor

        System.out.print("Enter The Operation(+,-,*,/)  : ");
        String ope = sr.next();

        System.out.println("--------- : Results : --------- ");

       switch (ope){
           case "+" :
               System.out.println("Addition : " +s.add());
               break;
           case "-" :
               System.out.println("Substraction : "+s.sub());
               break;
           case "*" :
               System.out.println("Multiplication : "+s.mul());
               break;
           case "/" :
               System.out.println("Divison : "+ s.div());
               break;
           default:
               System.out.println("Invalid Entry");

       }


    }

}

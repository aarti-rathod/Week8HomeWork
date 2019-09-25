import java.util.Scanner;

/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to display the following character rhombus structure.
 */
public class RhombusDisplay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = sc.nextInt();


        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) { //1  //For Column

           //For Giving space //For Row
            //----------------
            for (int spc = n - count2; spc > 0; spc--){ //2
                System.out.print(" ");
            }
            //---------------------



            if (i < n)
            {
                count2++;
            }
            else
            {
                count2--;
            }


            ////print Character
            for (int j = 0; j < count; j++){        //3
                System.out.print(c);
                if (j < count / 2) //0
                {
                    c++;
                } else
                {
                    c--;
                }
            }


            if (i < n)
            {
                count = count + 2;
            }
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }

//int a[] ={5,7,9};





    }
}

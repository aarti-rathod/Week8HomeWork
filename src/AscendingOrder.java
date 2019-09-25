import java.util.Scanner;

/**
 * Write a program for ascending order of the number?
 *
 * Created by JANVI on 21/09/2019.
 */
public class AscendingOrder {
    public static void main(String[] args) {

        int a[] = new int[]{5,8,10,4,9};
        //4,5,8,9,10



        System.out.println("--------- : Original Array :  -------");

        for(int i = 0 ; i<a.length; i++){
            System.out.println(a[i]);
        }


        //Ascending Order

        //int a[] = new int[]{5,8,10,4,9};
                        //    0,1,2, 3,4

        int temp=0;
        for (int i = 0; i < a.length; i++) {

           for (int j = i + 1; j < a.length; j++) {

               if (a[i] > a[j]) {
                    temp = a[i]; //10
                    a[i] = a[j];
                    a[j] = temp;

              }
          }

     }

     //{4,5,8,9,10}

        System.out.println("------ : Ascending Order : ---------");

        for(int j=0;j<a.length;j++) {
            System.out.println(a[j]);
        }


        }
}

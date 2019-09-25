/**
 * Created by JANVI on 22/09/2019.
 */
/*
Write a Java program to remove a specific element from an array.
 */

//10. Write a Java program to remove a specific element from an array.

import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {


                Scanner in = new Scanner(System.in);
                int[] ar = {1, 2, 5, 12, 7, 3, 8 ,20,30,45,78};

        //1,5,12,7,3,8
                System.out.print("Enter The Number For Delete : ");

        //19
                int num = in.nextInt();

                //elem = 19 ;
                //Loop 8 times Exe
                //7 num = 19


        //Loop-1 :: To Check The User Entered Number in the whole array
                for(int i = 0; i < ar.length; i++){


                   // To check user entered number = array list number
                    if(ar[i] == num){
                      //i=7

                        // Loop 2 : To Move That number at next position
                        for(int j = i; j < ar.length-1 ; j++){
                            ar[j] = ar[j+1];
                        }
                        break;
                    }
                }



                System.out.println(" " );
        //Loop 3 : To Print Changed Array But Not " Last One "
                for(int i = 0; i < ar.length-1; i++){
                    System.out.print(" "+ ar[i]);
                }
            }
        }




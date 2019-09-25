/**
 * Created by JANVI on 22/09/2019.
 */
/*
23. Write a Java program to get and display information (year, month, day, hour,
minute) of a default calendar.
 */
//Write a Java program to get and display information (year, month, day, hour,

import java.util.*;
public class calanderDefault {
    public static void main(String[] args) {

        Calendar s = Calendar.getInstance();

        System.out.println("--------------: Default Time :----------");

        System.out.println("Year : "+s.get(Calendar.YEAR));
        System.out.println("Month : "+(s.get(Calendar.MONTH)+1));
        System.out.println("Day :" + s.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour :"+s.get(Calendar.HOUR));
        System.out.println("Minute : "+s.get(Calendar.MINUTE));


    }
}

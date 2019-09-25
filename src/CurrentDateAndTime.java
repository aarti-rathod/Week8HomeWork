/**
 * Created by JANVI on 22/09/2019.
 */
/*
25. Write a Java program to display the dates in the following formats.
 */
//25. Write a Java program to display the dates in the following formats.
import java.util.*;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("---: Current Date and Time :----");
        System.out.format("Date  : %tB %te, %tY%n", c, c, c);
        System.out.format("Time  : %tl:%tM %tp%n", c, c, c);
    }
}

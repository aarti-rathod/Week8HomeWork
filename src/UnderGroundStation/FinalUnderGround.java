package UnderGroundStation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JANVI on 25/09/2019.
 */
public class FinalUnderGround {
    public static void main(String[] args) {



        String xyz;
        String sn[] = {};
        String xy = " ";
        String str = " ";
        char aa = ' ';
        int p = 0;


        boolean validValue;


        Scanner objs = new Scanner(System.in);


        //-------------------------Start---------------------//

        do {

        do {


            System.out.println("::------------------WELCOME------------------::");

            System.out.print("Enter The Station Name : ");

            String c = objs.nextLine(); // user input

            xy = c.toLowerCase().replaceAll(" ", "");


            String station[] = {"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican", "Bayswater",
                    "Blackfriars ", "Bond Street", "Borough", "Cannon Street ",
                    "Chancery Lane", "Charing Cross ", "Charing Cross " , "Covent Garden", "Earl's Court",
                    "Edgware Road", "Euston ", "Euston Square", "Farringdon", "Fenchurch Street", "Gloucester Road"
                    , "Goodge Street", "Great Portland Street", "Green Park", "Embarkment", "Elephant And Castle",
                    "Gloucester Road" , "High Street Kensington", "Embarkment"};

            //create array list method

            List<String> list = Arrays.asList(station);

            if (list.toString().toLowerCase().replaceAll(" ", "").contains(c.toLowerCase().replaceAll(" ", ""))) {
                //System.out.print("Valid Station Name : ");
                validValue = true;
            } else {
                System.out.print(" Invalid station name ,enter again..:");
                validValue = false;
            }


        } while (!validValue);


        //--------------------------------Train Lines------------------------------//

            String trianLines[][] = {
                    {"Edgware Road", "Baker Street", "Charing Cross", "Embarkment", "Elephant And Castle"}, //Bakerloo line-1
                    {"Gloucester Road", "Green Park", "Covent Garden"},//Picadilly line-2
                    {"Green Park", "Bond Street", "Baker Street"}, //jubilee line-3
                    {"Aldgate", "Barbican", "Euston Square", "Farringdon", "Great Portland Street", "Baker Street"},//Metropolitan line-4
                    {"Baker Street", "Great Portland Street", "Euston Square", "Farringdon", "Barbican","Aldgate East"},// Hammersmith and city Line : -5
                    {"Edgware Road", "Bays Water", "High Street Kensington", "Gloucester Road",
                            "Embarkment", "Canon Street", "Aldgate", "Barbican",
                            "Farringdon", "Euston Square", "Baker Street", "Great Portland Street","Blackfriars", "Fenchurch Street" },//  Circle Line -6
            {"Borough", "Elephant and Castle", "Charing Cross", "Bank", "Goodges Street", "Angle", "Euston" ,"Angel" }, //Northen Line -7
            {"Bank"},//Waterloo and City Line : -8
            {"Bond Street", "Chancery Lane", "Bank"}, //Central Line : -9
            {"Edgware Road", "Bays Water", "Gloucester Road", "Earl’s Court", "Embarkment", "Cannon Street", "Aldgate East","Blackfriars" } //Distric Circle : -10
};


            System.out.println("---------------------Train Lines -------------------- ");

            for (int i = 0; i < trianLines.length; i++) {

                for (int j = 0; j < trianLines[i].length; j++) {

                    if (i == 0) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Bakerloo Line ---: ");
                        }
                    } else if (i == 1) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Piccadilly Line ---: ");
                        }
                    } else if (i == 2) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Jubilee Line ---: ");
                        }
                    } else if (i == 3) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Metropolitan Line ---: ");
                        }
                    } else if (i == 4) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- HammerSmith And City Line ---: ");
                        }
                    } else if (i == 5) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Circle Line ---: ");
                        }
                    } else if (i == 6) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Northen Line ---: ");
                        }
                    } else if (i == 7) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Waterloo and City Line ---: ");
                        }
                    } else if (i == 8) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Central Line--- : ");
                        }
                    } else if (i == 9) {
                        str = trianLines[i][j].toLowerCase().replaceAll(" ", "");
                        if (xy.equals(str)) {
                            System.out.println(" :--- Distric Line ---: ");
                        }
                    }

                }
            }

            System.out.println("-------------------------------------------------");

//////////////////////////////////////////////////////////////

            System.out.println(" \n");
            //---------------To Continue ----------------//

            do {

                p++;

                System.out.print("Do you Want To Continue ? Press Y OR Press N for Exit :");

                xyz = objs.nextLine();

//                if (p > 3) {
//                    System.out.println("Jay Shree Krishna : Aavjo ");
//                    return;
//                }


            } while (!xyz.toLowerCase().equals("y") && !xyz.toLowerCase().equals("n"));


        } while (!xyz.toLowerCase().equals("n"));

        System.out.println(": -----------!! Thanks For Visiting London Underground !!----------------- :");
    }
}









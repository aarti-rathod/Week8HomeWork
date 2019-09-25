/**
 * Created by JANVI on 22/09/2019.
 */
public class DigitChecks {
    public static void main(String[] args) {

        String s = "Abcd12345678";
        int count=0;

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) {
                count++;
            }
        }

        System.out.println("Digits in Strings  : ");
        System.out.print(count);




    }
}

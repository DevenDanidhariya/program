package Prectical.ExtraPrectice.StringMethods;

public class JavaStringindexof {


    public static void main(String[] args) {



        String stringOfname = "DevenParagbhaiDanidhariya";

        int result ;

        result = stringOfname.indexOf('z',10);
        System.out.println(result);
    }
}

/* The indexOf() method returns the index of the first occurrence of the specified character/substring within the string.

the Syntax for the indexOf method :>> string.indexOf(int ch, int fromIndex)  or  string.indexOf(String str, int fromIndex)


it returns -1 is specified character/string is not found.
 */

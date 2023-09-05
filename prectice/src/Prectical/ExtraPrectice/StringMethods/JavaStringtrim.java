package Prectical.ExtraPrectice.StringMethods;

public class JavaStringtrim {
    public static void main(String[] args) {
        String stringOfTriming = "    sitaram ram ram ram\n radhe shyam shyam shyam\n      ";

        System.out.println(stringOfTriming);

        System.out.println(stringOfTriming.trim());
        String result ;
        result  = stringOfTriming.replaceAll("\\s", "");

        System.out.println(result);
    }
}


/*

The JavaString trim method removes any leading(starting) and trailing (ending) whitespace from the specified string.

syntax for String trim method :>>string.trim()

it returns a string with leading and trailing whitespace removed
returns original string if there is no white space in starting or ending

if removing of all white space then


result = str1.replaceall("\\s", "");
 */

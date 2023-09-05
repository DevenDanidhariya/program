package Prectical.ExtraPrectice.StringMethods;

public class JavastringequalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "programingwithjava";
        String str2 = "ProgramingWithJAVA";

        boolean result = str1.equalsIgnoreCase(str2);

        System.out.println(result);

    }
}


/* this String method is also similar to as equals method but int equals method is the String is same but one is
* in camel case and other one is in lowe case then it returns false but in some of condition we only need the string is
* same or not,  not necessary it should be in same case in this type of requirement we cam use the Java String
* equalsIgnoreCase() method.
*
* Syntax for that:string.equalsIgnoreCase(String str)
*
* what it returns :>> it return true if the String are equal, ignoring case consideration*/
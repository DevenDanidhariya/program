/*
package Prectical.ExtraPrectice.StringMethods;

public class Stringsplit {
    public static void main(String[] args){

        String text = "Java is a fun Programing Language";

        String[] result = text.split(" ");

        System.out.print("result:-");
        for (String str : result){
            System.out.print(str+ ", ");
        }
    }
}
*/




package Prectical.ExtraPrectice.StringMethods;


import java.lang.reflect.Array;
import java.util.Arrays;

class StringMethods {

    public static void main(String[] args) {
        String name = "d+e+v+e+n";

        String[] result = name.split("\\+");
        for (String str : result) {
            System.out.print(str + ".");
        }
    }
}

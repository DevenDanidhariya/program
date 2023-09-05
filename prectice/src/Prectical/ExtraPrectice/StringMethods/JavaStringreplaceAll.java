package Prectical.ExtraPrectice.StringMethods;

public class JavaStringreplaceAll {
    public static void main (String[] args){
        String str = "hello Neven Paragbhai Danidhariya";

        System.out.println("the string with error"+" " +str);

        System.out.println("the String with correction"+" "+str);

        System.out.println(str.replaceAll("Neven","Deven"));
    }
}

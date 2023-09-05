package Prectical.ExtraPrectice.StringMethods;

public class JavaStringIntern {

    public static void main(String[] args){
//        String str1="xyz";
//        String str2="xyz";
        String str1 = new String("xyz,deven,danidhariya");
        String str2 = new String("xyz");

        str1 = str1.intern();
        str2 = str2.intern();
        System.out.println(str1.length());

    }
}

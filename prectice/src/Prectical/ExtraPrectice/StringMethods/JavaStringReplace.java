package Prectical.ExtraPrectice.StringMethods;

public class JavaStringReplace {
    public static void main(String[] args) {
        String str1 = "xbc xbc xbc ";
        String str2 = "c++ Programing";

        System.out.println(str1);
        System.out.println(str1.replace("x", "a"));
        System.out.println(str2);
        System.out.println(str2.replace("c++", "java"));
    }
}

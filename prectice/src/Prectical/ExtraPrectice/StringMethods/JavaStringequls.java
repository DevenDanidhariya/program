package Prectical.ExtraPrectice.StringMethods;

public class JavaStringequls {
    public static void main(String[] args) {
        String str1 = "Deven Paragbhai Danidhariya";
        String str2 = "Deven Paragbhai Danidhariya";
        String str3 = "Paragbhai Narendrabhai Danidhariya";

        boolean result1 = str1.equals(str2);
        boolean result2 = str2.equals(str3);
        boolean result3 = str3.equals(str1);

        System.out.println(result1+" "+result2+" "+result3);
    }
}

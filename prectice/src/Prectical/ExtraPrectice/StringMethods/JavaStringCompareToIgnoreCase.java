package Prectical.ExtraPrectice.StringMethods;

public class JavaStringCompareToIgnoreCase {
    public static void main(String[] args){
        String name1 = "Danidhariya Deven Paragbhai";
        String name2 = "danidhariya deven paragbhai";

        int result;

        result = name1.compareToIgnoreCase(name2);
        System.out.println(result);
        if(result==0){
            System.out.println("the name1 and name2 are same");
        }
        else {
            System.out.println("the name1 and nam2 are not same");
        }

    }
}

package Prectical.ExtraPrectice.StringMethods;

public class JavaStringCompareTO {
  public static void main(String[] args) {
      String str1 = "Learn java";
      String str2 = "Learn java";
      String str3 = "Learn Kotlin";

      int result;

      result = str1.compareTo(str2);
      if(result==0){
          System.out.println("String 1 and String 2 are same");
      }
      else{
          System.out.println("String 1 and String 2 are not same");
      }
      System.out.println("Result:-"+result);

      result = str2.compareTo(str3);
      if(result==0){
          System.out.println("String 2 and String 3 are same");
      }
      else{
          System.out.println("String 2 and String 3 are not same");
      }
      System.out.println("Result:-"+result);

      result = str3.compareTo(str1);
      if(result==0){
          System.out.println("String 3 and String 1 are same");
      }
      else{
          System.out.println("String 3 and String 1 are not same");
      }
      System.out.println("Result:-"+result);

  }
}

public class main{
    public static void gfg(String s){
        System.out.println("String");
    }
    public static void gfg(Object o){
        System.out.println("object");
    }

    public static void main(String args[]){
        gfg(null);
    }
}
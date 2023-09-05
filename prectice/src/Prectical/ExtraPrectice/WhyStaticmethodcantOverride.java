package Prectical.ExtraPrectice;
class OverParent{
    static void demo(){
        System.out.println("hello");
    }


}
class OverChild extends OverParent{
    static void demo(){
        System.out.println("Hello java");
    }
}
public class WhyStaticmethodcantOverride {
    public static void main(String[] args){
        OverParent ref = new OverChild();
        ref.demo();
        //OverChild.demo();
    }
}




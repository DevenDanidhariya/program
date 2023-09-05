package Prectical.ExtraPrectice.DesignPattern.SingletonPattern;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singletonclass{

    private static Singletonclass single;
    private Singletonclass(){

        String srt = "hello world";
        System.out.println(srt);
    }

    public static Singletonclass getInstance(){
        if (single == null){
            single = new Singletonclass();
        }
        return single;
    }

}
public class ExampleOfSinfletonPattern {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Singletonclass single1 = Singletonclass.getInstance();
        //System.out.println(single1.hashCode());

        Constructor<Singletonclass> constructor = Singletonclass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singletonclass s2 = constructor.newInstance();
        //System.out.println(s2.hashCode());

        if (single1.equals(s2)){
            System.out.println("are equal");
        }


    }

}

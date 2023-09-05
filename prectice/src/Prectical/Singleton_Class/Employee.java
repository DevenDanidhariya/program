package Prectical.Singleton_Class;

public class Employee {

    private static final Employee obj = new Employee();

    private Employee(){

    }

    public static  Employee instance(){
        return obj;
    }
}

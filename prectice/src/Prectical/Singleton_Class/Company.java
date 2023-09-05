package Prectical.Singleton_Class;

public class Company {

    private static final Company ref = new Company();



    private Company(){

    }
    public static Company instance(){return ref;}
}

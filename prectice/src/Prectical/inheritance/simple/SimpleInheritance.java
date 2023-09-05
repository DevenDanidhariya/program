package Prectical.inheritance.simple;
class Inheritance{
    void typeOfInheritance(){
        System.out.println("simpleinheritance");
        System.out.println("multipleinheritance");
        System.out.println("multilevelinheritance");
        System.out.println("Hybridinheritance");
    }
}
class types extends Inheritance {

}

public class SimpleInheritance  {
    public static void main(String[] args) {
        Inheritance ref =new types();
        ref.typeOfInheritance();
    }
}

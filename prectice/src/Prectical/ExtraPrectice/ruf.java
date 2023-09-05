
package Prectical.ExtraPrectice;

/*
class Employdetails
{
    int id;
    String name;
    String designation;
    static String company;

    public void show()
    {
        System.out.println(id+" "+name+" "+designation+" "+company);
    }
}

public class ruf
{
    public static void main(String[] args){
        Employdetails deven = new Employdetails();
        deven.id = 5;
        deven.name= "Deven";
        deven.designation="AssosiateSoftwareEngineer";
        Employdetails.company="SkylinkInfosolution";

        Employdetails dharmik= new Employdetails();
        dharmik.id=4;
        dharmik.name="Dharmik";
        dharmik.designation="AssociateSoftwareEnginer";

        deven.show();
        dharmik.show();

    }

}
*/


public class ruf{
    public static void main(String[] args) {
        try{
        int division;
        int a;
        int b;

        a=10;
        b=0;

        division=a/b;


            division=a/b;
        }
        catch (NullPointerException d){
            System.out.println("same");
        }
        finally {
            System.out.println("a is not divisable by b");
        }
    }
}






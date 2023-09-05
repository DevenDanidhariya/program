package Prectical.Singleton_Class;

public class main {
    public static void main(String[] args) {
        Employee deven = Employee.instance();
        Employee dhrumil = Employee.instance();
        Employee nisharg = Employee.instance();

        Company c1 = Company.instance();
        Company c2 = Company.instance();
        Company c3 = Company.instance();

        System.out.println("pointing to Employee");
        System.out.println("Hash code of deven:"+deven.hashCode());
        System.out.println("Hash code of dhrumil:"+dhrumil.hashCode());
        System.out.println("Hash coed of nisharg:"+nisharg.hashCode());

        System.out.println("pointing to Company");
        System.out.println("Hash code of c1:"+c1.hashCode());
        System.out.println("Hash code of c2:"+c2.hashCode());
        System.out.println("Hash code of c3:"+c3.hashCode());

        if (deven == dhrumil&& dhrumil==nisharg){
            System.out.println("the all three are pointing one location");
        } else if (c1 == c2 && c2 == c3) {
            System.out.println("the all the company are pointing to one location");
        } else
        {
            System.out.println("the all three are pointing to diffrent location");
        }
    }
}

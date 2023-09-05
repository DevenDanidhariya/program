package Prectical.overriding;
class Childname{
    void name(){
        System.out.println("Deven");
        System.out.println("uma");
    }
}
class FamilyMemberName extends Childname{
    void name(){
        System.out.println("parag");
        System.out.println("daxa");
        System.out.println("Uma");
        System.out.println("Deven");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Childname R = new FamilyMemberName();
        R.name();
    }
}

/*we can not override static, final and private method
final: because it is final that's why can not override final method
static: static means common for all the class not specific for echa class hence static method not override
private: because it is not accessible
 */


/*what is method overriding:-
*/
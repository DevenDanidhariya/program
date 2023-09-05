package Prectical.Encapsulation;
class Employ_Details{
    private String employsName;
    private String birthplace;
    private int id;
    private String password;
    private int mobile_number;


    public String getEmploysName() {
        return employsName;
    }

    public void setEmploysName(String employsName) {
        this.employsName = employsName;
    }

    public String getbirthplace(){
        return birthplace;
    }
    public void setbirthplace(String birthplace){
        this.birthplace = birthplace;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getMobile_number(){
        return mobile_number;
    }
    public void setMobile_number(int mobile_number){
        this.mobile_number= mobile_number;
    }
    public  String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
public class Employ_Encapsulation {
    public static void main(String[] args) {
        Employ_Details ref = new Employ_Details();

        ref.setEmploysName("Deven");
        ref.setbirthplace("Rajkot");
        ref.setId(190);
        ref.setPassword("102030");
        ref.setMobile_number(1112223334);


        System.out.println("Employ name:"+ref.getEmploysName());
        System.out.println("Employ birthplace:"+ref.getbirthplace());
        System.out.println("Employ Id:"+ref.getId());
        System.out.println("Employ password:"+ref.getPassword());
        System.out.println("Employs mobile number:"+ref.getMobile_number());

    }
}

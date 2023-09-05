package Prectical.Singleton_Class;

class StafName {
    static StafName object = null;

    String name;
    private StafName(){name="Deven";}

    public static synchronized StafName getinstance(){
        if (object == null)
             object = new StafName();
            return object;
    }

}

class Staffdetail{
    public static void main(String[] args) {
      StafName name_start_with_letter = StafName.getinstance();
      StafName Employ_of_Skyinkinfosolution = StafName.getinstance();
      StafName having_indian_citisionship = StafName.getinstance();

        System.out.println("name_start_with_letterd:"+name_start_with_letter.hashCode());
        System.out.println("Employ_of_Skyinkinfosolution:"+Employ_of_Skyinkinfosolution.hashCode());
        System.out.println("having_indian_citisionship:"+having_indian_citisionship.hashCode());

      /*  name_start_with_letter=x;
        Employ_of_Skyinkinfosolution=y;
        also_Know_Java=z;

        System.out.println(x+" "+y+" "+z);*/

    }
}

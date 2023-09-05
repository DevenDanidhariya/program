package Prectical.GetOutput;

public class main1 {
    public static void gfg(String s)///String is having higher priority
    {
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }


    public static void main(String args[])
    {
        gfg(null);
    }
}

//The output of the above program is String because the String is having higher priority over object

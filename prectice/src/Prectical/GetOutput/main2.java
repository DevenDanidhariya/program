package Prectical.GetOutput;

public class main2 {
    public static void main(String []args)
    {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1+" "+ s2 + " " +(s1==s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1+" "+sb2+" "+(sb1==sb2));

        StringBuilder sbu1 = new StringBuilder("abc");
        StringBuilder sbu2 = sbu1;
        sbu2.append("d");
        System.out.println(sbu1+" "+sbu2+" "+(sbu1==sbu2));

    }
}

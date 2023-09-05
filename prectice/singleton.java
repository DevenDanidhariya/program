//class 1

class singleton {

    static singleton single_instance=null;

    String s;

    private singleton()
    {
        s="hello i am string of singleton class";
    }

    public static synchronized singleton getInstance(){
        if (single_instance==null)   
            single_instance=new singleton();

        return single_instance;
    }
}

//class 2

class abc{
    public static void main(String[] args) {
        singleton x= singleton.getInstance();

        singleton y = singleton.getInstance();

        singleton z= singleton.getInstance();


        System.out.println("hash code of x"+x.hashCode());

        System.out.println("hash code of y"+y.hashCode());
    
        System.out.println("hash code of z"+z.hashCode());

        if(x==y && y==z){
            System.out.println("the three obj are pointing to same memory location in heap");
        }

        else{
            System.out.println("the obj are not pointing to same mamory location in heap");
        }
    }
}

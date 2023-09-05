package Prectical.ExtraPrectice;

abstract class Cars{
    void turnOnCar(){}
    void turnOffCar(){}
    String getCarType(){return null;}
}

class ManualCar extends Cars{

    private final String carType = "Manual Car";
    public void turnOnCar(){
        System.out.println("turn on manual car");
    }
    public void turnOffCar(){
        System.out.println("turn off the manual car");
    }

    public String getCarType(){
        return this.carType;
    }
}
class AutomaticCars extends Cars{

    private final String carType = "Automatic car";
    public void turnOnCar(){
        System.out.println("turn on automatic car");
    }

    public void turnOffCar(){
        System.out.println("turn off the Automatic car");
    }

    public String getCarType(){
        return this.carType;
    }
}

public class AbstractionPrectice{
    public static void main (String[] args){
        Cars car1 = new ManualCar();
        Cars car2 = new AutomaticCars();

        car1 .turnOnCar();
        System.out.println(car1.getCarType());
        car1.turnOffCar();


        car2.turnOnCar();
        System.out.println(car2.getCarType());
        car2.turnOffCar();

    }
}

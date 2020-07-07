package InterfaceAbstractClassDemo;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 100.00);

        System.out.println("Cars Max Speed " + car.getSpeed());
        System.out.println("Cars Max Speed " + car.getWheel());

        car.setCarStrength(10);
        System.out.println("Strength: " + car.getCarStrength());

        car.youCrashed();

        if (car.carDrivable){
            System.out.println("This car is driveable");
        }else{
            System.out.println("The car is not driveable");
        }

    }

}

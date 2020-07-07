package SuperClassDemo;

import InterfaceAbstractClassDemo.Vehicle;

public class Main {

    public static void main(String[] args) {
        Object superCar = new Vehicle();
        System.out.println(((Vehicle)superCar).getSpeed());

        Vehicle superTrack = new Vehicle();

        System.out.println(superCar.equals(superTrack));

        System.out.println(superCar.hashCode());

        System.out.println(superCar.getClass());

        System.out.println(superCar.getClass().getName());

        if (superCar.getClass() == superTrack.getClass()){
            System.out.println("The Same");
        }

        System.out.println(superCar.getClass().getSuperclass());

        System.out.println(superTrack);

        int randNum = 100;
        System.out.println(Integer.toString(randNum));

        superTrack.setWheel(6);

////        Vehicle superTrack2 = (Vehicle)superTrack.clone();
//
//        System.out.println(superTrack.getWheel());
//        System.out.println(superTrack2.getWheel());
//
//        System.out.println(superTrack.hashCode());
//        System.out.println(superTrack2.hashCode());

    }

}

package InterfaceAbstractClassDemo;

public class Vehicle extends Crashable implements Drivable,Cloneable {

    int numOfWheels = 2;
    double theSpeed = 0;

    int carStrength = 0;

    public Vehicle(int wheels, double speed) {
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    public Vehicle() {
    }

    @Override
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }

    @Override
    public int getCarStrength() {
        return this.carStrength;
    }

    @Override
    public int getWheel() {
        return this.numOfWheels;
    }

    @Override
    public void setWheel(int numWheels) {
            this.numOfWheels=numWheels;
    }

    @Override
    public double getSpeed() {
        return this.theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
            this.theSpeed=speed;
    }

    @Override
    public String toString() {
        return "Num of Wheels: " + this.numOfWheels;
    }

    @Override
    protected Object clone() {
        Vehicle car;

        try {
            car = (Vehicle) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
        return car;
    }

}

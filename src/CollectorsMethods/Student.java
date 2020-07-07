package CollectorsMethods;

public class Student extends Person {

    private double mark;

    public Student(String name, String country, double mark) {
        super(name, country);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}

package CollectorsMethods;

public class Employee extends Person {

    private double salary;
    private String dept;

    public Employee(String name, String country, double salary, String dept) {
        super(name, country);
        this.salary = salary;
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

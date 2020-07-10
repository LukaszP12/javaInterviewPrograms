package CloneableDemo;

public class ABC implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "ABC{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

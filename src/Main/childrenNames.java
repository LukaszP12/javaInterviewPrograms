package Main;

public class childrenNames {

    public static void childrenNames(String... names) {
        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        childrenNames(); 
        childrenNames("Jane");
        childrenNames("Jane","Tom","Peter");
    }

}

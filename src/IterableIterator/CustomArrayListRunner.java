package IterableIterator;

public class CustomArrayListRunner<myCustomArray> {

    public static void main(String[] args) {
        CustomArrayList<String> myCustomArray = new CustomArrayList<>();

        myCustomArray.add("Test Value 1");
        myCustomArray.add("Custom Value 2");
        myCustomArray.add("3rd val");
        myCustomArray.add("the 4th value");

        for(String str : myCustomArray){
            System.out.println(str);
        }
    }

}

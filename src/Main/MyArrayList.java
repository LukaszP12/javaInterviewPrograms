package Main;

import java.util.Arrays;

public class MyArrayList {

    private Object[] myStore;
    private int actSize = 0;

    public MyArrayList() {
        myStore = new Object[10];
    }

    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }

    public Object remove(int index){
        if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while (tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size(){
        return actSize;
    }

    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew Length: "+myStore.length);
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Integer(2));
        myArrayList.add(new Integer(5));
        myArrayList.add(new Integer(1));
        myArrayList.add(new Integer(23));
        myArrayList.add(new Integer(14));
        for (int i=0; i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i)+" ");
        }
        myArrayList.add(new Integer(29));
        System.out.println("Element at Index 5:"+myArrayList.get(5));
        System.out.println("List size: " + myArrayList.size());
        System.out.println("Removing size at index 2: " + myArrayList.remove(2));
        for (int i=0;  i< myArrayList.size(); i++){
            System.out.println(myArrayList.get(i)+" ");
        }
    }

}

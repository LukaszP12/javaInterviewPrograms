import java.util.*;

public class removeDuplicatesArrayList {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list){
            if (!newList.contains(element)){
                newList.add(element);
            }
        }

        return newList;
    }

    public static <T> void removeDuplicatesArrayList(ArrayList<T> list){
        HashMap<T,Integer> map = new HashMap<T,Integer>();
        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list){
            if (!map.containsKey(element)){
                map.put(element,1);
            }
        }

        for (T element : map.keySet())
        {
            System.out.println(element);
        }

    }

    public static <T> void removeDuplicatesArrayList2(ArrayList<T> list){
        HashSet hashSet = new HashSet<T>();

        for (T element : list){
            if (!hashSet.contains(element)){
                hashSet.add(element);
            }
        }

        hashSet.stream().sorted().forEach(System.out::println);

    }

    // Using Set
    public static <T> ArrayList<T> removeDuplicatesHashSet(ArrayList<T> list)
    {
        // Create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();

        set.addAll(list);

        list.clear();

        list.addAll(set);

        return list;
    }

    public static void main(String[] args) {
        // Array with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        System.out.println("ArrayList with duplicates: " + list);

        // ArrayList<Integer> newList = removeDuplicates(list);

        /*ArrayList<Integer> newList2 = removeDuplicatesArrayList(list);
        newList2.stream().forEach(System.out::println); */

        // removeDuplicatesArrayList(list);

        /*ArrayList<Integer> newList3 = removeDuplicatesHashSet(list);
        newList3.stream().sorted().forEach(System.out::println);*/

        /*System.out.println("Using Stream distinct aproach");
        list.stream().distinct().sorted().forEach(System.out::println);*/

        removeDuplicatesArrayList2(list);

    }

}

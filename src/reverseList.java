import java.util.ArrayList;
import java.util.List;

public class reverseList {


    public static String reversingAList(List<String> list){

        if (list.isEmpty()){return "";  }

        return list.subList(0, 0) + reversingAList(list.subList(1, list.size()));

    }

    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();

        newList.add("list");
        newList.add("a");
        newList.add("reversing");
        newList.add("am");
        newList.add("I");

        String reversedList = reversingAList(newList);
        System.out.println(reversedList);

    }

}



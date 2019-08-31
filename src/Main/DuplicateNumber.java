package Main;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

    public int findDuplicateNumber(List<Integer> numbers){
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2); //arithmetic string sum
        return duplicate;
    }

    public int getSum(List<Integer> numbers){

        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1; i<30;i++){
            numbers.add(i);
        }
        //adding duplicate number into list
        numbers.add(22);
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        System.out.println("Duplicate number: " + duplicateNumber.findDuplicateNumber(numbers));
    }
}

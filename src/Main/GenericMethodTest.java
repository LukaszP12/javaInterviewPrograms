package Main;

public class GenericMethodTest {
    // generic method printArray
    public static < E > void printArray( E[] inputArray ) {
        // display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double and Characters
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'O'};

        System.out.println("Array integerArray contains: ");
        printArray(intArray);
        System.out.println("\nArray doubleArray contains: ");
        printArray(doubleArray);
        System.out.println("\nArray characterArray contrains: ");
        printArray(charArray);
    }

}

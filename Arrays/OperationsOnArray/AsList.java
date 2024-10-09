package Arrays.OperationsOnArray;
import java.util.Arrays;

public class AsList {

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50};
        Integer array[] = {10, 20, 30, 40, 50};

        // It prints the list containing that entire array as a single element because of int data type.
        System.out.println("Array as list " + Arrays.asList(arr)); // Array as list [[I@2f92e0f4]

        // Using Integer wapper class to print array as list.
        System.out.println("Array as list " + Arrays.asList(array)); // Array as list [10, 20, 30, 40, 50]
    }
    
}

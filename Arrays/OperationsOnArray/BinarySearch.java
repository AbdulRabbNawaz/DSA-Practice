package Arrays.OperationsOnArray;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        
        int arr[] = {60, 70, 30, 11, 100};

        // Arrays.sort(arr);
        int key = 30;

        System.out.println("index no. " + Arrays.binarySearch(arr, key));

        System.out.println("index no. " + Arrays.binarySearch(arr, 2, 4, key));
    }   
    
}

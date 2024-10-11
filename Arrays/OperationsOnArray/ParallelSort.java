package Arrays.OperationsOnArray;
import java.util.Arrays;

public class ParallelSort {

    public static void main(String[] args) {

        // The Arrays.parallelSort(intArr) method sorts the array using a parallel sorting algorithm. 
        // This can be faster than traditional sorting methods, especially for large arrays.
        
        int[] arr = {10, 80, 5, 2, 6, 100};

        int[] arr1 = {10, 80, 5, 2, 6, 100};

        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.parallelSort(arr);
        Arrays.sort(arr1); // Normal sort
        Arrays.sort(intArr, 1, 3);

        System.out.println("After sorting: " + Arrays.toString(arr));

        System.out.println("After sorting: " + Arrays.toString(arr1));
        
        System.out.println("After sorting: " + Arrays.toString(intArr));
    }
    
}

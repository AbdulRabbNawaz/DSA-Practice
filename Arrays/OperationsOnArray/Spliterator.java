package Arrays.OperationsOnArray;

import java.util.Arrays;

// A Spliterator is an object that can traverse a collection and partition it for parallel processing. 
// It is especially useful for working with Java's Streams and for parallel operations.
public class Spliterator {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Integer Array: " + Arrays.spliterator(arr));
        System.out.println("Integer Array: " + Arrays.spliterator(arr, 1, 3));
    }
    
}

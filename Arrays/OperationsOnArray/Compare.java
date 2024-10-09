package Arrays.OperationsOnArray;

import java.util.Arrays;

public class Compare {

    public static void main(String[] args) {
        
        int arr[] = {60, 70, 30, 11, 100};

        int arr1[] = {60, -5, 50, 11};

        // Output is positive because signed comparision.
        System.out.println("Integer Arrays on comparison: " + Arrays.compare(arr, arr1));

        // Output is negative because unsigned comparision.
        System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(arr, arr1));

        // In an unsigned context, negative values are interpreted as large positive values. 
        // For instance, the value -5 is treated as a very high value when interpreted in an unsigned manner.
    }
    
}

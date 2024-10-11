package Arrays.OperationsOnArray;
import java.util.Arrays;

public class DeepEquals {

    public static void main(String[] args) {
        
        int[][] arr = { {10, 20, 30, 40, 50} };

        int[][] arr1 = { {10, 20, 30, 40, 50} };

        System.out.println("Integer Arrays on comparison: " + Arrays.deepEquals(arr, arr1));

        // returns true if both arrays contain the same number of elements and all corresponding pairs of elements are equal.
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intArr1[] = { 10, 15, 22 };

        System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr, intArr1));
    }
    
}

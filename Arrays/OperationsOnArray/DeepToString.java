package Arrays.OperationsOnArray;
import java.util.Arrays;

public class DeepToString {

    public static void main(String[] args) {
        
        int[][] arr = { {10, 20, 30, 40, 50} };

        int[] arr1 = {10, 20, 30};

        System.out.println("Integer Array: " + Arrays.deepToString(arr));

        System.out.println("Integer Array: " + Arrays.toString(arr1));
    }
    
}

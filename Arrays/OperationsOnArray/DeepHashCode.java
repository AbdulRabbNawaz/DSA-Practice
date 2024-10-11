package Arrays.OperationsOnArray;
import java.util.Arrays;

public class DeepHashCode {

    public static void main(String[] args) {
        
        int[][] arr = { {10, 20, 30, 40, 50} };

        int[] arr1 = {10, 20, 30};

        System.out.println("Integer Array: " + Arrays.deepHashCode(arr));

        System.out.println("Integer Array: " + Arrays.hashCode(arr1));
    }
    
}

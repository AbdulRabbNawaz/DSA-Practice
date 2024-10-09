package Arrays.OperationsOnArray;
import java.util.*;

public class CopyOf {

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30};

        System.out.println("Original Array " + Arrays.toString(arr));

        System.out.println("After copying the elements " + Arrays.toString(Arrays.copyOf(arr, 10)));

        System.out.println("After copying the elements " + Arrays.toString(Arrays.copyOfRange(arr, 1, 2)));
    }
    
}

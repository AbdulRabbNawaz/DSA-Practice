package Arrays.OperationsOnArray;
import java.util.*;

public class Fill {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

        int key = 11;

        Arrays.fill(arr, key);

        System.out.println("Integer array on filling: " + Arrays.toString(arr));
    }
    
}

package Arrays;
import java.util.*;

public class Print2LargeNumber {

    public int print2largest(int[] arr) {
        
        // Brute Force Approach
        /*int large = 0;
        
        for(int i=0; i < arr.length-1; i++){
            large = arr[i];
            int j = 1;
            
            if(arr[i] < arr[j]){
                large = arr[j];
            }
            j++;
        }
        
        for(int i=large-1; large > 0; i--){
            for(int j=0; j < arr.length; j++){
                if(arr[j] == i){
                    return i;
                }
            }
        }
        return -1;*/
        
        // Optimize Approach
        int n = arr.length;
        
        if(n < 2){
            return -1;
        }
        
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        
        for(int i=0; i < n; i++){
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }
        
        if(second_large == Integer.MIN_VALUE){
            return -1;
        }
        return second_large;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        Print2LargeNumber ln = new Print2LargeNumber();
        int ans = ln.print2largest(arr);
        System.out.println("The Second Largest Number is: " + ans);

        sc.close();
    }


}

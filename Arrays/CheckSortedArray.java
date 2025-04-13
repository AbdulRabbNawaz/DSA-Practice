package Arrays;

public class CheckSortedArray {

    // Check if Array is Sorted
    public static boolean checkSorting(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[5]; 
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 90; 
        // arr[3] = 05;
        // arr[4] = 20;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50;

        boolean ans = checkSorting(arr);

        System.out.println(ans);
    }
}
public class BinarySearch{

    // Binary Search (O(log N)) – Requires sorted arrays.
    public static int search(int[] arr, int key){

        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int[] arr = new int[5]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50;

        int key = 40;

        int ans = search(arr, key);
        System.out.println(ans);
    }
}
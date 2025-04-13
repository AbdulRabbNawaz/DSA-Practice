package Arrays;

public class LinearSearch{

    // Linear Search (O(N)) – Suitable for unsorted arrays.
    public static int search(int[] arr, int key){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
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

        int key = 30;
        
        int ans = search(arr, key);

        System.out.println(ans);
    }
}
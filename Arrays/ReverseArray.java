public class ReverseArray{

    // Reverse an Array
    public static int[] reverse(int[] arr){

        int low = 0;
        int high = arr.length - 1;

        while(low < high){

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] =  temp;

            low++;
            high--;
        }

        return arr;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[5]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50;

        int[] ans = reverse(arr);

        for (int i = 0; i < ans.length; i++) {

            System.out.println(ans[i]);
            
        }
    }
}
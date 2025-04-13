public class MoveZero {

    // Move Zeros to End
    public static int[] moveZerosToEnd(int[] arr) {

        int index = 0;
        for(int num : arr){

            if(num != 0){
                arr[index++] = num;
            }
        }

        for(int i = index; i < arr.length; i++){
            arr[index] = 0;
        }
        
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[5]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 0; 
        arr[3] = 40;
        arr[4] = 50;

        int[] ans = moveZerosToEnd(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
    }
}
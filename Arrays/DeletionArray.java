package Arrays;

public class DeletionArray{

    public static void main(String[] args) {
        
        int[] arr = new int[5]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50;

        int index = 2;

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);
        }
    }
}
public class InsertionArray{

    public static void main(String[] args) {
        
        // int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // int index = 1;
        // int value = 15;

        // for(int i = arr.length - 1; i > index; i--){

        //     arr[i] = arr[i - 1];
        // }

        // arr[index] = value;

        // array size is 6, 50 is also considered
        int[] arr = new int[6]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50; 

        int index = 1, value = 15;
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " " + i);
        }

    }

}
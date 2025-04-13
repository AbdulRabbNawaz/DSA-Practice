public class MaxAndMin {

    // Find the Maximum and Minimum in an Array
    public static int max(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int num : arr){

            if(num > max){
                max = num;
            }
        }

        return max;
    }

    public static int min(int[] arr){

        int min = Integer.MAX_VALUE;

        for(int num : arr){

            if(num < min){
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[5]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50;

        int max = max(arr);
        int min = min(arr);

        System.out.println("max " + max + ", min " + min);
    }
    
}
package Arrays;

public class MethodArray {

    public static void main(String[] args) {
        
        int[] arr = m1();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
    // Returning Arrays from Methods
    public static int[] m1(){
        return new int[]{10,20,30};
    }
}

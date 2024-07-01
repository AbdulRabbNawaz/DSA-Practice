import java.util.Scanner;

public class MaximumNumber {

    public static int printMaxNum(int arr[]){

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter the elements in an array: ");
        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }

        int ans = printMaxNum(arr);
        System.out.println(ans);

        scanner.close();
        
    }
    
}

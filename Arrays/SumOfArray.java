package Arrays;
import java.util.Scanner;

public class SumOfArray {

    public static int arraySum(int a[]){

        int sum = 0;

        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        return sum;

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

        int ans = arraySum(arr);
        System.out.println(ans);

        scanner.close();
        
    }
    
}

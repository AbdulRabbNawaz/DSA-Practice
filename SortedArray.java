import java.util.Scanner;

public class SortedArray {

    public static boolean printArray(int a[]){

        for(int i=0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;

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

        boolean ans = printArray(arr);
        System.out.println(ans);

        scanner.close();
        
    }
    
}

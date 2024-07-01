import java.util.Scanner;

public class Average {

    public static double findAverage(int arr[]){

        int n = arr.length;
        int sum = 0;
        double avg;

        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        avg = sum/n;
        return avg;

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

        double ans = findAverage(arr);
        System.out.println(ans);

        scanner.close();
        
    }
    
}

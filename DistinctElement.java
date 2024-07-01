import java.util.Scanner;

public class DistinctElement {

    public static int countDigits(int arr[]){

        int count = 0;
        boolean isDistinct = true;

        for(int i=0; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i] == arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct == true){
                count++;
            }
            isDistinct = true;
        }
        return count;
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

        int ans = countDigits(arr);
        System.out.println(ans);

        scanner.close();
        
    }
    
}

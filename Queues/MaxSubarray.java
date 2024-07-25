package Queues;
import java.util.*;

public class MaxSubarray {

    public static void printMax(int arr[], int k){
        Deque<Integer> dq = new ArrayDeque<Integer>();

        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(int i=k; i<arr.length; i++){
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i-k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        printMax(arr, k);

        sc.close();
    }
    
}

package Arrays;
import java.util.*;

// Sort an array using Merge sort
public class SortArray {

    public int[] sortArray(int[] nums) {

        if(nums==null || nums.length==0){
            return nums;
        }

        subSort(nums, 0, nums.length-1);
        return nums;
    }

    public void subSort(int[] arr, int low, int high){

        if(low < high){

            int mid = (low+high)/2;

            subSort(arr, low, mid); // Sort left part of an array
            subSort(arr, mid+1, high); // Sort right part of an array

            mergeSort(arr, low, high, mid);
        }
    }   

    public void mergeSort(int[] arr, int low, int high, int mid){

        int n1 = mid-low+ 1;
        int n2 = high-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = arr[low+i];
        }
        for(int i=0; i<n2; i++){
            R[i] = arr[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2){
            j++;
            k++;
        }
    }       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        SortArray sr = new SortArray();
        int[] sortedArray = sr.sortArray(arr);
        System.out.println(Arrays.toString(sortedArray));

        sc.close();
    }
    
}

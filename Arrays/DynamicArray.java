package Arrays;
import java.util.*;

public class DynamicArray {

    private int arr[];
    private int count;

    public DynamicArray(int length){
        arr = new int[length];
    }

    public void insert(int element){
        
        if(arr.length == count){

            int[] newArr = new int[2 * arr.length];

            for(int i = 0; i < count; i++){
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[count++] = element;
    }

    public void printArray(){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        DynamicArray da = new DynamicArray(3);

        da.insert(10);
        da.insert(20);
        da.insert(30);
        da.insert(40);
        da.insert(50);

        da.printArray();
    }
    
}

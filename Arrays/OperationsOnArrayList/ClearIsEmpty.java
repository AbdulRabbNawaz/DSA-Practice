package Arrays.OperationsOnArrayList;

import java.util.ArrayList;

public class ClearIsEmpty {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);

        System.out.println(al.isEmpty());

        // It removes all elements from the array
        al.clear();

        // return true if array is empty
        System.out.println(al.isEmpty());
    }
    
}

package Arrays.OperationsOnArrayList;

import java.util.ArrayList;

public class Add {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);

        al.add(1, 40);

        System.out.println(al);
    }
    
}

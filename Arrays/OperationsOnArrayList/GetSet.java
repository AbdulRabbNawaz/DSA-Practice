package Arrays.OperationsOnArrayList;

import java.util.ArrayList;

public class GetSet {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al.get(1));;
        System.out.println(al.set(2, 40));
        System.out.println(al);
    }
    
}

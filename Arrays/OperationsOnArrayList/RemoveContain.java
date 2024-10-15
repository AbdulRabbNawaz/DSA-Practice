package Arrays.OperationsOnArrayList;

import java.util.ArrayList;

public class RemoveContain {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al.contains(20));
        System.out.println(al.remove(3));
        System.out.println(al.remove(Integer.valueOf(20)));
        System.out.println(al);
    }
    
}

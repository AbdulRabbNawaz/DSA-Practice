package Arrays.OperationsOnArrayList;

import java.util.ArrayList;

public class IndexOf {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);

        // indexOf() searching the element from starting
        System.out.println(al.indexOf(20));

        // lastIndexOf() searching the element from end
        System.out.println(al.lastIndexOf(10));

        // if element is not present than it will return -1
        System.out.println(al.indexOf(40));
    }
    
}

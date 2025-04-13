package Arrays.ArrayListTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SmallerElements {

    public List<Integer> printElements(ArrayList<Integer> al, int k){
        
        Iterator<Integer> it = al.iterator();

        List<Integer> list = new ArrayList<>();

        while (it.hasNext()) {
            
            int n = it.next();

            if(n < k){
                list.add(n);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
    
        al.add(8);
        al.add(100);
        al.add(20);
        al.add(40);
        al.add(3);
        al.add(7);

        SmallerElements se = new SmallerElements();
        Collections.sort(al);

        List<Integer> list = se.printElements(al, 10);

        System.out.println(list);
    }
    
}

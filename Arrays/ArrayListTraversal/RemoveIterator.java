package Arrays.ArrayListTraversal;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveIterator {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
    
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(30);

        // Iterator it = al.iterator(); ----> It is also work fine
        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {

            int n = it.next();

            if (n < 10) {
                it.remove();
            }
            else{
                System.out.println(n);
            }
            
        }
    }
    
}

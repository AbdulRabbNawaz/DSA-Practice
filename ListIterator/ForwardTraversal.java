package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForwardTraversal {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> lt = list.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }
    }
    
}

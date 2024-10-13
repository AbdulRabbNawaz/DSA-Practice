package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Addmethod {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> lt = list.listIterator(2);

        while (lt.hasNext()) {
            lt.add(2);
            lt.next();
        }

        System.out.println(lt.previousIndex());

        System.out.println(lt.nextIndex());

        System.out.println(list);
    }
    
}

package ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class SetMethod{

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> lt = list.listIterator(list.size());

        while(lt.hasPrevious()){
            int n = lt.previous();
            lt.set(n * 2);
        }

        System.out.println(list);
    }
}
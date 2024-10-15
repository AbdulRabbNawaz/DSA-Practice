package Arrays.ArrayListTraversal;

import java.util.ArrayList;

public class Get {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

        for (Integer i : al) {
            System.out.print(i + " ");
        }
    }
    
}

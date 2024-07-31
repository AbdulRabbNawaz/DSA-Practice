package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // traverse HashMap using foreach loop
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        sc.close();
    }
    
}

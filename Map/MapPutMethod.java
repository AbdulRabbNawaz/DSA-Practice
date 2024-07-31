package Map;

import java.util.HashMap;
import java.util.Scanner;

public class MapPutMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "one"); // 'put' method is used to add an element into the hashmap
        map.put(2, "two");
        map.put(3, "three");

        System.out.println("Mappings of map: " + map);

        map.put(2, "for"); // 'put' is also used for changing the value

        System.out.println("Mappings of map: " + map);

        sc.close();
    }
    
}

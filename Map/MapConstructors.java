package Map;

import java.util.HashMap;
import java.util.Scanner;

public class MapConstructors {

    // Hashmap Constructor
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map1.put(4, "four");
        map1.put(5, "five");
        map1.put(6, "six");

        System.out.println("Mappings of map: " + map);
        System.out.println("mappings of map1: " + map1);

        sc.close();
    }*/


    // HashMap(int intialCapacity) Constructor ---> default value of intialCapacity is 16
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>(10);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>(3);

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map1.put(4, "four");
        map1.put(5, "five");
        map1.put(6, "six");

        System.out.println("Mappings of map: " + map);
        System.out.println("mappings of map1: " + map1);

        sc.close();
    }*/

    // HashMap(int intialCapacity, float loadFactor) Constructor ----> default values of intialCapacity and loadFactor is 16 and 0.75
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>(10, 0.75f);

        HashMap<Integer, String> map1 = new HashMap<Integer, String>(5,0.5f);

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map1.put(4, "four");
        map1.put(5, "five");
        map1.put(6, "six");

        System.out.println("Mappings of map: " + map);
        System.out.println("mappings of map1: " + map1);

        sc.close();
    }*/

    // HashMap(Map map) Constructor 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        HashMap<Integer, String> map1 = new HashMap<Integer, String>(map);

        map1.put(4, "four");
        map1.put(5, "five");
        map1.put(6, "six");

        System.out.println("Mappings of map: " + map);
        System.out.println("mappings of map1: " + map1);

        sc.close();
    }
    
}

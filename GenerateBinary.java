import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinary {

    public static ArrayList<String> printBinary(int n){

        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("1");
        
        while (n-- > 0) {
            String s = queue.poll();
            result.add(s); 
        
            queue.offer(s + "0");
            queue.offer(s + "1");
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(printBinary(n));
        
        sc.close();
    }
    
}

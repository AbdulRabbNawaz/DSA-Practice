package Strings;
import java.util.*;

public class PangramChecking {

    public static boolean isPangram(String s){

        int n = s.length();

        if(n < 26){
            return false;
        }
        else{
            boolean visited[] = new boolean[26];
            for(int i=0; i<n; i++){
                char x = s.charAt(i);
                if(x >= 'a' && x <= 'z'){
                    visited[x-'a'] = true;
                }
                if(x >= 'A' && x <= 'Z'){
                    visited[x-'A'] = true;
                }
            }
            for(int i=0; i<26; i++){
                if(visited[i] == false){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scanner.nextLine();

        System.out.println(isPangram(s));
        // The quick brown fox jumps over the lazy dog -> true
        
        scanner.close();
    }
    
}

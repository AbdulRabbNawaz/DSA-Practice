package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecking {

    // TC -> nlogn
    public static boolean checkAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(checkAnagram(s1, s2));

        scanner.close();
    }
    
}

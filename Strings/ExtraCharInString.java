package Strings;
import java.util.Scanner;

public class ExtraCharInString {

    public static char printChar(String s1, String s2){

        int count[] = new int[26];
        int n = s1.length();

        for(int i=0; i<n; i++){
            int a = count[s1.charAt(i) - 'a']--;
            System.out.println("a="+a);
            int b = count[s2.charAt(i) - 'a']++;
            System.out.println("b="+b);
        }
        int c = count[s2.charAt(n) - 'a']++;
        System.out.println(c);

        for(int i=0; i<26; i++){
            if(count[i] == 1){
                return (char)(i +'a');
            }
        }
        return 0;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(printChar(s1, s2));

        scanner.close();
    }
    
}

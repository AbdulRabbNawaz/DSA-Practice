import java.util.Scanner;

public class ExtraCharInStringOpti {

    public static char printChar(String s1, String s2){

        int res = 0;
        int n = s1.length();

        for(int i=0; i<n; i++){
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }
        res = res ^ s2.charAt(n);
        return (char) res;
        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(printChar(s1, s2));

        scanner.close();
    }
    
}

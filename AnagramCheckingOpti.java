import java.util.Scanner;

public class AnagramCheckingOpti {

    static final int CHAR = 256;

    // TC -> O(n)
    public static boolean checkAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        int count[] = new int[CHAR];
        
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<CHAR; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(checkAnagram(s1, s2));

        scanner.close();
    }
    
}

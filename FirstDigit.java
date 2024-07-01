import java.util.Scanner;

public class FirstDigit {

    public static int findDigit(int n){

        double power = Math.log10(n);
        int i = (int) power;
        int p = (int) Math.pow(10, i);

        int ans = n/p;
        return ans;
        
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int ans = findDigit(n);
        System.out.println(ans);

        scanner.close();
    }
    
}

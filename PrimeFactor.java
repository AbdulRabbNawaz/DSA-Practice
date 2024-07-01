import java.util.Scanner;

public class PrimeFactor {

    public static boolean isPrime(int n){

        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeFactor(int n){

        for(int i=2; i<n; i++){
            if(isPrime(i)){
                int x = i;
                while (n%x==0) {
                    System.out.print(i + " ");
                    x = x*i;
                }
            }
        }      
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        primeFactor(n);

        scanner.close();
    }
    
}

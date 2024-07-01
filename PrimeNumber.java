import java.util.Scanner;

public class PrimeNumber {

    public static boolean printPrime(int n){

        if(n == 1){
            return false;
        }

        // Time Complexcity -> O(n)
        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;

        // Time Complexcity -> O(squareroot of n)
        // for(int i=2; i*i<=n; i++){
        //     if(n%i==0)
        //         return false;
        // }
        // return true;    
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        boolean value = printPrime(n);
        System.out.println(value);
        scanner.close();
    }
    
}

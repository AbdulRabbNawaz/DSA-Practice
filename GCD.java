import java.util.Scanner;

public class GCD {

     public static void printGCD(int a, int b){

        int min = Math.min(a, b);
        int ans = 1;

        if(a<=0 || b<=0){
            System.out.println("Invalid Number");
            return;
        }

        for(int i=1; i<=min; i++){

            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        System.out.println("GCD of a and b is " + ans);
        
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter frst number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        printGCD(a,b);
        scanner.close();
    }
    
}

import java.util.Scanner;

public class Fibonacci {

    // Fibonacci sol. with mod

    // public static int fibonacciNumber(int n){
    //     // Write your code here.

    //     int first = 0;
    //     int second = 1;
    //     int sum = 0;

    //     int mod = (int)Math.pow(10, 9)+7;

    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     else {
    //         for(int i=2; i<=n; i++){
    //             sum = first + second;
    //             first = second;
    //             second = sum;
    //             if(second>=mod){
    //                 second = second - mod;
    //             }
    //         }
    //         return second;
    //     }
    // }

    public static void printFibonacci(int n){

        if(n == 0){
            System.out.print(1);
        }

        else if(n == 1){
            System.out.print(1 + " ");
            System.out.print(1);
        }

        else{
            System.out.print(1 + " ");
            System.out.print(1 + " ");

            int a = 1;
            int b = 1;

            for(int i=2; i<=n; i++){
                int c = a+b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        printFibonacci(n);
        scanner.close();
    }
    
}

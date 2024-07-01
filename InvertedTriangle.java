import java.util.Scanner;

public class InvertedTriangle {

    public static void printPattern(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // for(int j=1; j<=n-i; j++){
            //     System.out.print(" ");
            // }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        printPattern(n);
        scanner.close();
    }
    
}

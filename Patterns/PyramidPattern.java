import java.util.Scanner;

public class PyramidPattern {

    public static void printPattern(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            // for(int j=0; j<n-i+1; j++){
            //     System.out.print(" ");
            // }
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

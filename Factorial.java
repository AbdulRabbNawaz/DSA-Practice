import java.util.Scanner;

public class Factorial {

    public static void printPattern(int n){

        int i = 1;
        while(n > 0){
            i = i * n;
            n--;
        }
        System.out.println(i);
        
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        printPattern(n);
        scanner.close();
    }
    
}

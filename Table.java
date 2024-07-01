import java.util.Scanner;

public class Table {

    public static void printTable(int n){

            if(n < 0){
                System.out.println("Invalid Number");
                return;
            }

            for(int i=1; i<=10; i++){
                int t = i * n;
                System.out.print(t + " ");
            }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        printTable(n);
        
        scanner.close();
    }
    
}

import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {

        // int n = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

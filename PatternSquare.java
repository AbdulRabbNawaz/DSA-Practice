import java.util.Scanner;

public class PatternSquare {

    public static void PrintSquare(int s){
        //Complete the code given below

        for(int i=1; i<=s; i++){
            int count = s;
            if(i == 1 || i == s){
                while(count > 0) {
                    System.out.print("*");
                    count--;
                }
            }

            else{
                count = s - 2;
                System.out.print("*");
                while(count > 0){
                    System.out.print(" ");
                    count--;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        PrintSquare(n);
        scanner.close();
    }
    
}

import java.util.Scanner;

public class LCM {

    public static void printLCM(int a, int b){

        int max = Math.max(a, b);
        int y = a*b;
        int ans = max;

        if(a<=0 || b<=0){
            System.out.println("Invalid Number");
            return;
        }

        for(int i=max; i<=y; i++){

            if(i%a==0 && i%b==0){
                ans = i;
                break;
            }
        }
        System.out.println("LCM of a and b is " + ans);
        
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter frst number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        printLCM(a,b);
        scanner.close();
    }
    
}

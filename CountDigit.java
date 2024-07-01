import java.util.Scanner;

public class CountDigit{

    public void countDigits(int n){
        int count = 0;
            while(n>0){
                n = n/10;
                count = count + 1;
            }
            System.out.println(count);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        CountDigit cd = new CountDigit();
        cd.countDigits(n);

        scanner.close();
    }
}
package Arrays;

import java.util.Scanner;

public class PrintRowInPascal {

    public static void print(int i){

        System.out.print(i + " ");
    }

    public static void printRow(int n){

        int ans = 1;
        print(ans);

        for(int i = 1; i < n; i++){

            ans = ans * (n - i);
            ans = ans / (i);

            print(ans);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        printRow(row);
        
    }
    
}

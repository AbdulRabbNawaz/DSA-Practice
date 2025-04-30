package Arrays;
import java.util.*;

public class PascalTriangle {

    public static int nCr(int n, int r){

        int res = 1;

        for(int i = 0; i < r; i++){ 

            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int ans = pascalTriangle(row, column);

        System.out.println("Element: " + ans);
        
    }
    
}

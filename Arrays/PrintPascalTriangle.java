package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintPascalTriangle {

    public static List<Integer> generate(int row){

        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col = 1; col < row; col++){

            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }

        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n){

        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 1; row <= n; row++){
            ans.add(generate(row));
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    
}

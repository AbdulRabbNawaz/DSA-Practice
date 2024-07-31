import java.util.Scanner;

public class SellStock {

    /*PROBLEM :- 
    Given an array prices where prices[i] is the price of a given stock on the i-th day, you want to 
    maximize your profit by choosing a single day to buy one stock and choosing a different day in the 
    future to sell that stock. Return the maximum profit you can achieve from this transaction. 
    If you cannot achieve any profit, return 0.*/

    public static int maxProfit(int[] prices, int n){
        
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0; i<n; i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            else if(prices[i] - min_price > max_profit){
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        
        System.out.println(maxProfit(prices,n));

        sc.close();
    }
    
}

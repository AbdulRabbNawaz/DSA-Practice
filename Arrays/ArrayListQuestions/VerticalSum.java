package Arrays.ArrayListQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class VerticalSum {

    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {

        ArrayList<Integer> verticalSum = new ArrayList<>();
    
        for(int i = 0; i < arr.size(); i++){
        
            for(int j = 0; j < arr.get(i).size(); j++){
            
                while(verticalSum.size() <= j){
                    verticalSum.add(0);
                }
            
                verticalSum.set(j, verticalSum.get(j) + arr.get(i).get(j));
            }
        }
    
        int minSum = Integer.MAX_VALUE;
    
        for(int min : verticalSum){
            if(min < minSum){
                minSum = min;
            }
        }
    
        return minSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        int t = 1;
		while(t-->0)
		{
		    //Taking the total number of rows
		    int n=sc.nextInt();
		    
		    //Declaring and Initalizing an ArrayList
		    ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		        //Taking the number of columns
		        int m=sc.nextInt();
		        
		        //Declaring and Intializing an ArrayList for each row
		        ArrayList<Integer>temp=new ArrayList<>();
		        
		        for(int j=0;j<m;j++)
		        {
		            temp.add(sc.nextInt());
		        }
		        
		        arr.add(temp);
		    }

            //Calling the method minimum_verical_sum
		    System.out.println("Minimum vertical sum: " + minimum_vertical_sum(arr));

            sc.close();
		}
        // arr = {{2 3 5}, {1 2}, {1 4 5 1}}
    }
    
}

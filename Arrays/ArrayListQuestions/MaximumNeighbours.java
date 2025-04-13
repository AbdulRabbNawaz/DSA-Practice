package Arrays.ArrayListQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumNeighbours {

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer>arr){

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr.size() == 0){
            return ans;
        }
        
        for(int i = 1; i < arr.size(); i++){
                
            ans.add(Math.max(arr.get(i - 1), arr.get(i)));
        }
        
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		//Taking input all the testcases
		
        int t = 1;

		while(t>0)
		{
		    //Taking the total number of elements 
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList of type Integer
		    ArrayList<Integer>arr=new ArrayList<>();
		    
		    //adding all the elements to the ArrayList
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    
		    
		    //Calling the method maxNeighbour
		    ArrayList<Integer>ans=maxNeighbour(arr);
		    
		    //Printing the elements
		    for(int x:ans)
		    System.out.print(x+" ");
		    
		    System.out.println();
        }

        sc.close();
    }
    
}

package Strings;

import java.util.Scanner;

public class ReverseString {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while(l < r){
            if(isVowel(arr[l]) && isVowel(arr[r])){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else if(isVowel(arr[l])){
                r--;
            }
            else if(isVowel(arr[r])){
                l++;
            }
            else{
                l++;
                r--;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char c){
            if(c == 'a' || c == 'A'){
                return true;
            }
            else if(c == 'e' || c == 'E'){
                return true;
            }
            else if(c == 'i' || c == 'I'){
                return true;
            }
            else if(c == 'o' || c == 'O'){
                return true;
            }
            else if(c == 'u' || c == 'U'){
                return true;
            }
            else{
                return false;
            }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        ReverseString rs = new ReverseString();
        String ans = rs.reverseVowels(s);
        System.out.println(ans);

        sc.close();
        
    }
    
}

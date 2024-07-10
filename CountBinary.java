import java.util.Scanner;

public class CountBinary {

    public static int countSetBits(int n) {

		int rem = 0;
		int count = 0;

		while(n != 0){
			rem = n%2;
			if(rem == 1){
				count++;
			}
            // System.out.print(rem);
			n /= 2;
		}
		return count;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countSetBits(n));

        sc.close();
    }
    
}

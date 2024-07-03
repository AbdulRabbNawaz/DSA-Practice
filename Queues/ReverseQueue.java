package Queues;

import java.util.*;

class ReverseQueue{

    public static void printReverse(Queue<Integer> q, int k){

        if(q.size()<k || k<=0){
            return;
        }

        Deque<Integer> stack = new ArrayDeque<Integer>();

        for(int i=0; i<k; i++){
            stack.push(q.poll());
        }
        while(stack.isEmpty() == false){
            q.offer(stack.pop());
        }
        for(int i=0; i<q.size()-k; i++){
            q.offer(q.poll());
        }
        System.out.println(q);

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = scanner.nextInt();
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            int q = scanner.nextInt();
            queue.offer(q);
        }
        printReverse(queue, k);

        scanner.close();
    }
}
package lvl2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String args[]){
        int [] scoville = {1,2,3,9,10,12};
        int k = 7;
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int sco : scoville){
            heap.offer(sco);
        }
        while(heap.peek() <= k){
            if(heap.size() ==1){
                answer = -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a +(b*2);

            heap.offer(result);
            answer ++;
        }
        System.out.println(answer);
    }
}

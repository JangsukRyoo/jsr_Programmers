package lvl2;

import java.util.Collections;
import java.util.PriorityQueue;


public class printer {
    public static void main(String args[]){
        int[] priorities = {2,1,3,2};
        int location  = 2;
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : priorities){
            pq.offer(n);
        }

        while(!pq.isEmpty()){

            for(int i = 0;i<priorities.length;i++){

                if(pq.peek() == priorities[i] ){
                    pq.poll();
                    answer++;

                    if(location == i )
                        System.out.println(answer);
                }
            }
        }
        System.out.println(answer);
    }
}

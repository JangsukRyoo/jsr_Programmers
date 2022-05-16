package lvl2;

public class functionDev {
    public static void main(String args[]){
        int [] progresses = new int[100];
        int [] speed = new int[100];

        int[] tmp = new int[100];
        int day = -1;
        for(int i =0; i<progresses.length; i++){
            while(progresses[i] +(speed[i] * day)<100){
                day ++;
            }
            tmp[day]++;
        }
        int ct =0;
        for(int n : tmp){
            if(n !=0) ct++;
        }

        int[] answer = new int[ct];
        ct = 0;
        for(int n : tmp){
            if(n!=0) answer[ct++] = n;
        }
        System.out.println(answer);
    }
}

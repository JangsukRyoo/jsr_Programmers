package lvl1;

public class MiniRec {
    public static void main(String args[]){
        int[][] sizes ={{60,50},{30,70},{60,30},{80,40}};
        int max = 0;
        int min = 0;

        for(int[] size : sizes){
            int bigger = Math.max(size[0],size[1]);
            int smaller = Math.min(size[0],size[1]);

            if(bigger > max){
                max = bigger;
            }
            if(smaller > min){
                min = smaller;
            }
        }
        System.out.println(max * min);
    }
}

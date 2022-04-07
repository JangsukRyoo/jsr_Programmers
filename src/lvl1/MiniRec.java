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
    //최소 사각형을 구하는 문제
    // 직사각혀을 돌릴 수 있으므로, 가로 세로로 구분하는것이 아닌 제일 큰수, 제일 작은수로 구분
    // 그중에서 제일 큰 값들을 곱하여 구하는문제
}

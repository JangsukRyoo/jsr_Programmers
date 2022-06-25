package lvl2;

import java.util.ArrayList;

public class HanoiTower {
     static ArrayList<int[]> arr;

    public static void main(String args[]) {
        int n = 2;
        arr = new ArrayList<>();
        hanoi(n,1,3,2);

        int[][] answer = new int[arr.size()][2];
        for(int i =0; i < arr.size()-1; ++i) {
            int[] cmd = arr.get(i);
            answer[i][0] = cmd[0];
            answer[i][i] = cmd[1];

            System.out.println(answer[i][i]);
        }
    }

    private static void hanoi(int n, int fr, int t, int v){
        int[] mv = {fr, t};

        if(n ==1){
            arr.add(mv);
        }else{
            hanoi(n-1, fr,v,t);
            arr.add(mv);
            hanoi(n-1, v,t,fr);
        }
    }
}

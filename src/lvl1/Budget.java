package lvl1;

import java.util.Arrays;

public class Budget {
    public int answer(int[] d, int budget){
        int sum = 0;
        int ct = 0;
        Arrays.sort(d);
        for(int i = 0; i<d.length; i++){
            if(sum + d[i] > budget){
                break;
            }
            sum += d[i];
            ct ++;
        }
        return ct;
    }
}

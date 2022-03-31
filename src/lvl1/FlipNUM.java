package lvl1;

import java.util.Arrays;
import java.util.Collections;

public class FlipNUM {
    public static void main(String args[]){
        int n = 118372;
        String s = String.valueOf(n);
        long answer =0;
        String[] numArr = s.split("");
        Arrays.sort(numArr);
        Collections.reverse(Arrays.asList(numArr));
        answer = Long.parseLong(String.join("",numArr));

        System.out.println(answer);
    }
}

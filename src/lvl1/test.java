package lvl1;

import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String args[]) {

        int[] A = {1,3,6,4,1,2};
        List<Integer> arrList = Arrays.stream(A).boxed().distinct().collect(Collectors.toList());

        Collections.sort(arrList);
        int result = 0;
        int ct = 1;

        for(int a : arrList){
                if(a != ct){
                    result = ct;
                    break;
                }
            ct ++;
        }

        System.out.println(result);

    }
}

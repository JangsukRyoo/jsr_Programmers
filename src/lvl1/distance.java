package lvl1;
import java.util.*;
public class distance {
    public static void main(String args[]) {
        long wid = 51;
        long hei = 37;

        int[][] diag = {{17,19}};
        long result;

        result = factorial(wid+hei) / ((factorial(wid) * (factorial(hei))));

    }

    static long factorial(long a){
        long res =1;
        for(long i = 88; i >0; i--){
            res = res * i;
        }
        System.out.println(res);
        return res;
    }

}

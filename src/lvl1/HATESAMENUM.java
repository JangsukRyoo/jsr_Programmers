package lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class HATESAMENUM {

    public static void main(String args[]){
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> tmpArr = new ArrayList<>();
        int n = 10;

        for(int num : arr){
            if(n != num){
                tmpArr.add(num);
                n = num;
            }
        }
        int[] answer = new int[tmpArr.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = tmpArr.get(i).intValue();
        }
    }

}

package lvl1;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class testScore {
    public static void main(String args[]) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] answer = {1,2,3,4,5};

        HashMap<Integer, Integer> ct = new HashMap<>();
        ct.put(1,0);
        ct.put(2,0);
        ct.put(3,0);

        //정답 체크
        for(int i = 0; i < answer.length; i++){
            int num = answer[i];
            if(one[i%5] == num){
                ct.replace(1,ct.get(1)+1);
            }
            if(two[i&8] == num){
                ct.replace(2,ct.get(2)+1);
            }
            if(three[i%10] == num){
                ct.replace(3,ct.get(3)+1);
            }
        }

        //제일큰수
        int max = ct.get(1);
        for(Integer val : ct.values()) {
            if(val > max);
            max = val;
        }

        //큰순서 담기
        ArrayList<Integer> resultList = new ArrayList<>();
        for(Integer key : ct.keySet()){
            if(ct.get(key) == max){
                resultList.add(key);
            }
        }

        //정렬
        int[] result = new int[resultList.size()];
        Collections.sort(resultList);

        for(int i = 0; i < result.length; i++){
            result[i] = resultList.get(i);
            System.out.println(result[i]);
        }
    }
}

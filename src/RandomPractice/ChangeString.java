package RandomPractice;

import java.util.*;

public class ChangeString {
    public static void main(String args[]){
        String call ="aBcabcDefabc";
        int max = 0;
        String answer =call;
        call = call.toLowerCase();

        String[] arrCall = call.split("");
        Set<String> setCall= new HashSet<String>(Arrays.asList(arrCall));
        ArrayList<String> listCall = new ArrayList<>(Arrays.asList(arrCall));
        Map<String,Integer> tmp = new HashMap<String, Integer>();

        for(String str : setCall){
            System.out.println(str + " : " + Collections.frequency(listCall,str));
            int num = Collections.frequency(listCall,str);
            if(num > max){
                max = num;
            }
            tmp.put(str,num);
        }

        for(String key : tmp.keySet()){
            if(tmp.get(key) == max){
                answer = answer.replaceAll(key.toUpperCase(),"");
                answer = answer.replaceAll(key.toLowerCase(),"");
            }
        }
        System.out.println(tmp);
        System.out.println(setCall);
        System.out.println(answer);;
    }
}

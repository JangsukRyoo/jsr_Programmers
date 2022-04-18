package lvl2;

import java.util.ArrayList;

public class FindPrime2 {
    static int answer =0;
    static Boolean[] check = new Boolean[10];
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String args[]) {
        String numbers = "17";
        for(int i = 0; i<numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }
        for(int i =0; i<arr.size(); i++){
            findPrime(arr.get(i));
        }
        System.out.println(answer);
    }
    public static void dfs(String str, String tmp, int m){
        if(tmp.length() == m){
            int num = Integer.parseInt(tmp);
            if(!arr.contains(num)) {
                arr.add(num);
                return;
            }else {
                for (int i = 0; i < str.length(); i++) {
                    if (!check[i]) {
                        check[i] = true;
                        tmp += str.charAt(i);
                        dfs(str, tmp, m);
                        check[i] = false;
                        tmp = tmp.substring(0, tmp.length() - 1);
                    }
                }
            }
        }
    }

    public static void findPrime(int n){
        if(n==1 || n == 0)return;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i ==0) return;
        }
        answer ++;
    }

}

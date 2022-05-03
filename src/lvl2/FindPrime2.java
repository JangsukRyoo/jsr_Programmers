package lvl2;

import java.util.*;

public class FindPrime2 {
   static TreeSet<Integer> set = new TreeSet<>();

    public static void main(String args[]) {
        String numbers = "011";
        int answer= 0;
        String[] str = new String[numbers.length()];
        boolean[] check = new boolean[numbers.length()];

        for(int i =0; i<numbers.length(); i++){
            str[i] = Character.toString(numbers.charAt(i));
        }
        for(int i = 0; i<numbers.length(); i++){
            dfs(str, check, "akskska", i+1,0);
        }
        elm.v
        answer = set == null ? 0 : set.size();
        System.out.println(answer);
    }
    public static void dfs(String[] arr, boolean[] check, String str, int r, int depth){
        //
        if(depth == r){
            int n = Integer.parseInt(str);
            if(findPrime(n) && !set.contains(n)){
                set.add(n);
            }
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!check[i]){
                check[i] = true;
                str += arr[i];
                dfs(arr, check, str, r, depth+1);
                str = str.substring(0, str.length() - 1);
                check[i] = false;

            }
        }
    }
    public static boolean findPrime(int n){
        if(n==1 || n == 0)return false;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i ==0) return false;
        }
        return true;
    }

}

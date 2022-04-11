package lvl2;

public class DFSANDBFS {
    static int answer = 0;
    public static void main(String args[]){
        int[] numbers = {4,1,2,1};
        int tget = 4;
        dfs(numbers, tget,0, 0 );
        System.out.println(answer);
    }

    public static void dfs(int[] numbers, int tget, int i, int sum){
        if( i == numbers.length){
            if(sum == tget) answer ++;
             return;
        }
        dfs(numbers, tget, i+1, sum+numbers[i]);
        dfs(numbers, tget, i+1, sum-numbers[i]);
    }
}

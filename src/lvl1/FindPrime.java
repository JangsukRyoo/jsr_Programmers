package lvl1;

public class FindPrime {
    public static void main(String args[]){
    int[] num = {1,2,3,4};
    int answer = 0;
    for(int i = 0; i < num.length-2; i++){
        for(int j=i+1; j<num.length-1; j++){
            for(int k = j+1; k<num.length;k++){
                answer += chkPrime(num[i]+num[j]+num[k]);
            }
        }
    }
        System.out.println(answer);
    }
    public static int chkPrime(int num){
        for(int i =2; i*i<=num; i++){
            if(num %i == 0) return 0;
        }
        return 1;
    }
}

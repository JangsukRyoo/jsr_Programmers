package lvl2;

public class NumExpression {
    public static void main(String args[]){

        int num = 15;
        int answer = 0;
        int sum = 0;
        for(int i = 1; i<=num; i++){
                sum = i;
                if(sum == num){
                    answer++;
                }
            for(int n = 1; n<num-i; n++) {
                sum += n;
                if (sum == num) {
                    answer++;
                    sum = 0;
                } else if (sum >num) {
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}

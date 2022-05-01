package lvl2;

public class NumExpression {
    public static void main(String args[]){

        int num = 15;
        int answer = 0;

        for(int i = 1; i<=num; i++){
            int n = i;
            int sum = 0;
            while(true) {
                sum += n;
                if (sum == num) {
                    answer++;
                    break;
                } else if (sum > num) {
                    break;
                }
                n++;
            }
        }
        System.out.println(answer);
    }
}

package lvl2;

public class Fibonacci {
    public static void main (String args[]){
        int answer = 0;
        int n = 3;
        int num1 = 1;
        int num2 = 1;
        if(n==1 || n==2) {
            System.out.println(1);
        }else{
            for(int i = 3; i<=n; i++){
                answer = (num1+num2)%1234567;
                num1 = num2;
                num2 = answer;
            }
            System.out.println(answer);
        }
    }
}

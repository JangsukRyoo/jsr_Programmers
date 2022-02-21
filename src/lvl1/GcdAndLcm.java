package lvl1;

public class GcdAndLcm {
    public static void main(String args[]){
        int[] answer = new int[2];

        int a = 3;
        int b = 12;

        answer[0] = gcd(a,b);
        answer[1] = a*b/answer[0];

        System.out.println(answer[0]);
        System.out.println(answer[1]);

    }
    public static int gcd(int a, int b){
        if(b ==0){
            return a;
        }
        return gcd(b, a%b);
    }
}

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

    //최대공약수 / 공약수중 최대인수
    // 구하는 방식이 끝까지 나눴을때 나눠 지는 값을 애기한다.
    //최소공배수는 두 수 값 * 최대공약수
}
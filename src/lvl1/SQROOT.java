package lvl1;

public class SQROOT {
    public static void main(String args[]){
    int n = 121;
    long answer =0;

    long sqrt = (long) Math.sqrt(n);

    if(Math.pow(sqrt,2) == n){
        answer = (long)Math.pow(sqrt+1,2);
    }else{
        answer = -1;
    }
        System.out.println(answer);

    }
}

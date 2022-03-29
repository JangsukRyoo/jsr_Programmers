package lvl1;

public class AddPlace {
    public static void main(String args[]){
        int n = 123;
        int answer =0;

        while(n!=0){
            answer += (n%10);
            n=n/10;
        }
        System.out.println(answer);

    }
}

package lvl1;

public class HarshadNum {
    public static void main(String args[]){
        boolean answer = true;

        int num = 12;
        int sum =0;
        String x =  Integer.toString(num);
        String[] a = x.split("");

        for(int i = 0; i < a.length; i++){
            sum += Integer.parseInt(a[i]);
        }

        if(num % sum != 0){
            answer = false;
        }else{
            answer = true;
        }
        System.out.println(answer);
    }
}

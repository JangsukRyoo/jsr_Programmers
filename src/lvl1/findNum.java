package lvl1;

public class findNum {
    public static void main(String args[]){
        int n = 10;
        int answer = 0;

        for(int i = 2; i<=n; i++){
            boolean fl = true;

            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    fl= false;
                    break;
                }
            }
            if(fl == true)
                answer ++;
        }
        System.out.println(answer);
    }
}

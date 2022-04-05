package lvl1;

public class DivideUntilZero {
    public static void main(String args[]){
        int n  = 12;
        int answer =0;

        for (int i = 1; i > 0; i++){

            if(n % i == 1){
                System.out.println(i);
                break;
            }
        }
    }
}

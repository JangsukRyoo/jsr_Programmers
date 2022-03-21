package RandomPractice;

public class NumDivide {
    public static void main (String args[]){
        int money = 4;
        int limit = 4;
        int[] answer = new int[2];

        int rest = money;
        int sct = 0;
        int tr = 1;

        while((limit != 0)){

            if(rest / limit != 0){
                rest = rest - limit;
                answer[0] += 1;
                sct ++;
            }else{
                limit = limit/2;
                answer[1] +=1;
                sct = 0;
            }

            if(sct == 2){
                break;

            }else if(tr ==1 && rest == 0){
                break;
            }

            tr ++;
        }


    }
}

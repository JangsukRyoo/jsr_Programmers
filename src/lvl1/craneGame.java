package lvl1;

//  크레인 인형뽑기 게임
public class craneGame {
    public static void main(String args[]) {
        int[][] crane = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1},{4,2,4,4,2}, {3,5,1,3,1}};
        int [] move = {1,5,3,5,1,2,1,4};

        int [] result = new int[move.length];
        int rindex = 0;
        int dollct = 0;

        for(int m = 0; m<move.length; m++){
            for(int i =0; i < crane.length; i++ ) {
                if(!(crane[i][move[m]-1] == 0)){
                    if(rindex !=0){
                        if(result[rindex-1] == crane[i][move[m]-1]) {
                            result[rindex-1] =0;
                            rindex --;
                            dollct += 2;
                        }else {
                            result [rindex] = crane[i][move[m]-1];
                            rindex ++;
                        }
                    }else {
                        result[rindex] = crane[i][move[m] - 1];
                        rindex ++;
                    }
                    crane[i][move[m]-1] = 0;
                    break;
                }
            }
        }
        System.out.println(dollct);
    }
}

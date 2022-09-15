package KaoKao;

import java.util.HashMap;

public class KeyPad {

    public static void main(String args[]){
        int[] number ={1,3,4,5,8,2,1,4,5,9,5};
        String hand = "right";
        String thumb = "";
        String answer = "";
        HashMap<String, Integer> thumbLoc = new HashMap<>();
        thumbLoc.put("R",12);
        thumbLoc.put("L",10);
        if(hand.equals("right")){
            thumb = "R";
        }else{
            thumb = "L";
        }
        for(int i = 0; i <number.length; i++){
            int num = number[i];
            if(num == 1 || num == 4 || num == 7){
                answer += "L";
                thumbLoc.replace("L",num);
            }
            if(num == 3 || num == 6 || num == 9){
                answer += "R";
                thumbLoc.replace("R",num);
            }

            if(num == 2 || num == 5 || num == 8|| num == 0){
                int lDis = disCal(thumbLoc.get("L"),num);
                int rDis = disCal(thumbLoc.get("R"),num);

                if(lDis < rDis){
                    answer+="L";
                    thumbLoc.replace("L",num);
                }else if(lDis > rDis){
                    answer+="R";
                    thumbLoc.replace("R",num);
                }else{
                    answer += thumb;
                    thumbLoc.replace(thumb,num);
                }
            }
        }
        System.out.println(answer);
    }

    public static int disCal (int location , int num){
        int result = 0;

        location =(location == 0) ? 11 : location;
        num = (num == 0) ? 11 : num;
        int x = (location - 1) / 3;
        int y = (location - 1) % 3;
        int numX = num / 3;
        int numY= 1;
        return Math.abs(x-numX) + Math.abs(y-numY);
    }

}

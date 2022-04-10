package RandomPractice;

import java.util.*;

public class Nevigation {
    public static void main(String args[]) {
        String path = "EEESEEEEEENNNN";
        String[] answer;
        List<String> list = new ArrayList<>();

        String cuDir = "";
        int dis = 0;
        int timect =0;
        int time = 0;

        String[] arrPath = path.split("");

        for(int i = 0; i < arrPath.length; i ++){
            if(i==0){
                cuDir = arrPath[0];
            }
            if(cuDir.equals(arrPath[i])){
                dis ++;
            }else if(!cuDir.equals(arrPath[i])){
                String dir = setdir(cuDir,arrPath[i]);
                if(dis >5){
                    dis = 5;
                }
                list.add("Time "+timect+": Go straight "+ dis+"00m and turn "+dir);
                dis = 1;
                cuDir = arrPath[i];
                timect -=timect;
            }
            timect ++;
        }
        System.out.println(list);
    }

    static String setdir(String curDir, String nDir){
        String direction ="";
        switch(curDir){
            case "E" : if(nDir.equals("N")){direction = "left";}
                        else if(nDir.equals("S")){direction ="right";}
                        break;
            case "W" : if(nDir.equals("N")){direction = "right";}
                       else if(nDir.equals("S")){direction ="left";}
                       break;
            case "N" : if(nDir.equals("E")){direction = "right";}
                     else if(nDir.equals("W")){direction ="left";}
                     break;

            case "S" : if(nDir.equals("E")){direction = "left";}
                     else if(nDir.equals("W")){direction ="right";}
                    break;
        }
        return direction;
    }
}

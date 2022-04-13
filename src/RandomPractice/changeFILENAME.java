package RandomPractice;

import java.util.Arrays;
import java.util.List;

public class changeFILENAME {
    public static void main(String args[]){

    String[] before = {"A", "B", "C","D"};
    String[] after = {"B", "Z", "D","C"};

    List<String> bList = Arrays.asList(before);
    List<String> aList = Arrays.asList(after);

    int result = -1;
    int tpCt = 0;
    boolean  rs = false;
    String tmp = "";
        do {
            for (int i = 0; i < bList.size();i++) {
                if(bList.get(i).equals(aList.get(i))){
                    continue;
                }else if (bList.contains(aList.get(i))) {
                    int nIndex = 0;
                    if(i == bList.size() -2){
                        nIndex = bList.indexOf(tmp);
                        bList.set(nIndex,tmp);
                        tpCt ++;

                        for (int j = 0; j < bList.size();j++) {
                            bList.set(j,aList.get(j));
                            tpCt ++;
                        }

                    }else {
                        tmp = bList.get(i);
                        bList.set(i ,  "temp" + tpCt);
                        tpCt++;
                    }

                }else{
                    bList.set(i,aList.get(i));
                    tpCt ++;
                }
            }

          rs = check(bList, aList);
        }while(!rs);
        System.out.println(tpCt);
    }

    static Boolean check(List<String> bf, List<String> at ){
        Boolean result = true;
        for(int i = 0; i<bf.size(); i++){
            if(bf.get(i).equals(at.get(i))){
                continue;
            }else{
             result = false;
            }
        }
        return result;
    }
}

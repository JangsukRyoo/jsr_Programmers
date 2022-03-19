package lvl1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PEclothe {

    public static void main(String args[]){
        int[] lost = {2,4};
        int[] reserve = {3,1};
        int n = 5;
        int result = 0;

        ArrayList<Integer> ctStud = new ArrayList();
        ArrayList<Integer> usStud = new ArrayList();
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i <lost.length; i++){
            for(int j = 0; j <reserve.length; j++){
                if(lost[i] == reserve[j]){
                    ctStud.add(lost[i]);
                    usStud.add(lost[i]);
                }
            }
        }

        for(int res : reserve){
            for(int lst : lost){
                if(lst == (res+1) || lst == (res -1)) {
                    if(!usStud.contains(res) && !ctStud.contains(lst)) {
                        ctStud.add(lst);
                        usStud.add(res);
                    }
                }
            }
        }

        result = n - (lost.length - ctStud.size());
        System.out.println(result);

    }
}

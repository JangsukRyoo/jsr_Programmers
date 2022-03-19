package lvl1;

import java.util.Locale;

public class StrangeWord {
    public static void main (String args[]){
        String  s = " jump  space one two  three ";
        String answer= "";
        String[] sSplit = s.split("",-1);
        int index = 0;

        for(int i = 0; i < sSplit.length; i++) {
            String word = sSplit[i];

            if(word.equals(" ")) {
                answer += " ";
                index = 0;
            }else if(index%2 == 0){
                answer += word.toUpperCase();
                index ++;
            }else{
                answer += word.toLowerCase();
                index ++;
            }
        }
        System.out.println(answer);
    }
}

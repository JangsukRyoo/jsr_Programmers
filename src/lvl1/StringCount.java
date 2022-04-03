package lvl1;

import static org.apache.groovy.parser.antlr4.util.StringUtils.countChar;

public class StringCount {
    public static void main(String args[]){
        String s ="pPddYY";
        boolean answer =true;

//        if(countChar(s,'p')+countChar(s,'P') != countChar(s,'y')+countChar(s,'Y')){
//            answer =false;
//        }
        s = s.replace('p','P');
        s = s.replace("y","Y");
        int num = 0;

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'P'){
                num +=1;
            }else if(s.charAt(i) == 'Y'){
                num += -1;
            }
        }
        if(num != 0){
            answer = false;
        }
        System.out.println(answer);
    }
}

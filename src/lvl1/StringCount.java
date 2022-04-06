package lvl1;

import java.util.Locale;

import static org.apache.groovy.parser.antlr4.util.StringUtils.countChar;

public class StringCount {
    public static void main(String args[]){
        String s ="pPddYY";
        boolean answer =true;

//        if(countChar(s,'p')+countChar(s,'P') != countChar(s,'y')+countChar(s,'Y')){
//            answer =false;
//        }
        s = s.toUpperCase(Locale.ROOT);
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

        //람다식 풀이
        answer =s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
        System.out.println(answer);
    }
}

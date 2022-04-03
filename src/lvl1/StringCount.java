package lvl1;

import static org.apache.groovy.parser.antlr4.util.StringUtils.countChar;

public class StringCount {
    public static void main(String args[]){
        String s ="pPY";
        boolean answer =true;

        if(countChar(s,'p')+countChar(s,'P') != countChar(s,'y')+countChar(s,'Y')){
            answer =false;
        }

        System.out.println(answer);
    }
}

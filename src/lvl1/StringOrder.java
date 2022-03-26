package lvl1;

import java.util.Arrays;

public class StringOrder {
    public static void main(String args[]){

        String s= "Zbcdefg";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        String answer = new StringBuilder(new String(charArr)).reverse().toString();
        System.out.println(answer);
    }
}

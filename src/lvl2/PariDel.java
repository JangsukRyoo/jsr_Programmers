package lvl2;

import java.util.Stack;

public class PariDel {
    public static void main(String args[]){
        String s="baabaa";
        Stack<Character> stack= new Stack<>();

        for ( int i =0; i< s.length(); i ++){

            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        int answer = stack.isEmpty() ? 1:0;
        System.out.println(answer);
    }
}

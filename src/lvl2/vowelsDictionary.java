package lvl2;

public class vowelsDictionary {
    public static void main(String args[]){
        String a = "AEIOU";
        String word ="AAAAE";
        int[] x = {781, 156, 31, 6,1};
        int answer = word.length();
        for(int i=0; i<word.length(); i++){
            int index = a.indexOf(word.charAt(i));
            answer += x[i] *index;
        }
        System.out.println(answer);
    }
}

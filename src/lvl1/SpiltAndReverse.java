package lvl1;

public class SpiltAndReverse {
    public static void main (String args[]){
        long n = 12345678;

        String a = new String(n+"");
        String[] stArr = a.split("");

        int[] answer = new int[stArr.length];
        int j = 0;
        for(int i = stArr.length-1; i >= 0; i-- ){
            answer[j] = Integer.parseInt(stArr[i]);
            j++;
        }
        System.out.println(answer);
    }
}

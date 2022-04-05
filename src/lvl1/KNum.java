package lvl1;

import java.util.Arrays;

public class KNum {
    public static void main(String args[]) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];
        int[] tmpArray;
        int a,b,c;

        for (int i = 0; i < commands.length; i++) {
            a = commands[i][0] -1;
            b = commands[i][1];
            c = commands[i][2] -1;
            tmpArray = Arrays.copyOfRange(array,a,b);
            Arrays.sort(tmpArray);
            answer[i] = tmpArray[c];
        }
        System.out.println(answer.toString());
    }
}

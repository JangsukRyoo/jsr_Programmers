package lvl2;

import java.util.Arrays;

public class BiggestNum {
    public static void main(String args[]){
            int[] numbers = {6,10,2};
            String[] result = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

            if (result[0].equals("0")) {
                System.out.println("0");
            }

            String answer = "";
            for (String a : result) {
                answer += a;
            }
        System.out.println(answer);
    }
}

package lvl1;

import java.util.Scanner;

public class Collatz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
               num /= 2;
            } else {
                num = (num * 3) + 1;
            }

            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
    }
}



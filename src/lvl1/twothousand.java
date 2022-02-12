package lvl1;

import java.util.Scanner;

public class twothousand {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String answer = "";
        int a = sc.nextInt();
        int b = sc.nextInt();

        String[] day = {"FRI","SAT","SUN","MOM","TUE","WED","THU"};

        int[] date  = {31,29,31,30,31,30,31,31,30,31,30,31};
        int total = 0;

        for(int i = 0; i<a-1; i++){
            total += date[i];
        }

        total += (b-1);

        answer = day[total%7];

        System.out.println(answer);
    }
}

package lvl1;

import java.util.Scanner;
// X만큼 간격이 있는 n개의 숫자
public class XandNnum {

    public static void main(String args[]){
        // 프로그래머스 문제 에서는 범위 떄문에 X를 long 타입으로 변환해야한다.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        long[] answer= new long[n];

        for(int i = 0; i<n; i++){
            answer[i] = x + (x*i);
        }
    }
}

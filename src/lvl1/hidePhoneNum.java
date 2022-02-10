package lvl1;

import java.util.Scanner;

//핸드폰 번호 가리기
public class hidePhoneNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String phoneNum = sc.nextLine();

        StringBuilder ans = new StringBuilder(phoneNum);

        for(int i =0; i< phoneNum.length()-4; i++){
            ans.setCharAt(i,'*');
        }
        System.out.println(ans.toString());
    }
}

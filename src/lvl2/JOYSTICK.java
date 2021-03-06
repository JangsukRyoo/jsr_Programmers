package lvl2;
import java.util.*;

public class JOYSTICK {
    public static void main(String args[]){
        String name = "JAN";
        int answer = 0;
//        int len = name.length();
//
//        int move = len-1;
//
//        for(int i=0; i<len; i++){
//            //상하 이동
//            if(name.charAt(i)> 'N'){
//                answer += 'Z' - name.charAt(i) +1;
//            }
//            //'A'~'N'의 경우
//            else{
//                answer += name.charAt(i) - 'A';
//            }
//            int conA = i+1;
//            //되돌아가는것이 빠른지 확인
//            while(conA < len && name.charAt(conA) == 'A'){
//                conA++;
//            }
//            move = Math.min(move, i+len-conA+i);
//
//        }
//        answer+=move;

        //코드 수정
        int length = name.length();

        int index;
        int move = length - 1;

        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;

            while(index < length && name.charAt(index) == 'A'){
                index++;
            }
            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }
        System.out.println(answer+move);
    }
}

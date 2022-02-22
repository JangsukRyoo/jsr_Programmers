package lvl1;

public class SecretMap {
    public static void main(String args[]){
        int n = 5;
        String[] answer = {};

        int[] arr1 ={9,20,28,18,11};
        int[] arr2={30,1,21,17,28};

         for(int i =0; i < n; i++){
             answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
              }

         for(int i = 0; i<n; i++){
             answer[i] = String.format("%" + n + "s", answer[i]);
             answer[i] = answer[i].replace("1","#");
             answer[i] = answer[i].replace("0","");
         }
    }

    // Integer.toBinaryString 안에 비트 연산자를 넣어서 동시에 처리
    // 바이너리 함수를 바꾸는것과 동시에 OR 연산자를 통하여 맞으면 1  0이 없으면 0을 출력하게 만든후
    // replacefh 1 과 0을 교체
    // String format을 통하여 몇자리수로 출력할것인지를 정해준다.
}

package lvl1;

public class EliminateSmallestNum {
    public static void main(String args[]){
        int[] arr = {4,3,2,1};
        int[] answer = {};
        answer = solution(arr);

    }
    static int[] solution(int[] arr) {
        int[] ans = {};
        int ansct =0; // 작은수가 중간에 있을 경우 런타임 에러가남 순서대로 증가하지 않음
        // -1 처리
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 작은수 걸러내기
        int minIdx = 0;
        for(int ct = 0; ct < arr.length; ct++){
            if(arr[minIdx] > arr[ct]) {
                minIdx = ct;
            }
        }

        //작은수 배열 제거
        for(int ct = 0; ct < arr.length; ct++){
            if(ct != minIdx){
                ans[ansct++] = arr[ct];
            }
        }
        return ans;
    }
}

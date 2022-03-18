package lvl1;

import javax.xml.ws.EndpointReference;
import java.util.*;

public class Failure {
    public static void main(String args[]) {
        int[] answer = {};
        int n = 4;
        //int [] stages = {2,1,2,6,2,4,3,3};
        int[] stages = {4, 4, 4, 4, 4};
        answer = solution(n, stages);

    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int length = stages.length;
        int ct = 0;
        int rest = 1;

        //스테이지 정렬
        Arrays.sort(stages);

        // 중복 확인 (실패율 계산을 위한 중복 확인)
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Double> failure = new HashMap<>();

        // 같은 수 정리
        for (int stage : stages) {
            if (stage == N + 1) {
                stage = stage - 1;
                map.put(stage, map.getOrDefault(stage, 0) + 1);
            } else {
                map.put(stage, map.getOrDefault(stage, 0) + 1);
            }
        }

        //정리 및 계산을 위한 entry로 변경
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());

        //실패율 계산
        for (Map.Entry<Integer, Integer> entry : entryList) {
            double fail = 0;

            double chk = ((double) entry.getValue() / (double) length);
            if (chk == 1) {
                fail = 0;
            } else {
                fail = chk;
            }

            failure.put(entry.getKey(), fail);
            System.out.println(fail);
            length -= entry.getValue();
        }

        // 내림차수 정렬
        List<Integer> keySet = new ArrayList<Integer>(failure.keySet());

        Collections.sort(keySet, (o1, o2) -> (failure.get(o2).compareTo(failure.get(o1))));

        for (int i = 0; i < N; i++) {
            if (i < keySet.size()) {
                answer[i] = keySet.get(i);
            } else {
                answer[i] = rest;
                rest++;
            }
        }
        return answer;
    }
}
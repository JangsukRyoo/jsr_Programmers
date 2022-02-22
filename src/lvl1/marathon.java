package lvl1;

import java.util.HashMap;

public class marathon {
    public static void main(String args[]) {

            //에제
            String[] participant = {"leo", "kiki", "eden"};
            String[] completion = {"leo", "kiki"};

    //        String[] participate = {"mislav","stanko","mislav","ana","mislav"};
    //        String[] completion = {"mislav","stanko","ana"};
            String answer = "";
            HashMap<String, Integer> map = new HashMap<>();

            for (String name : participant) {
                map.put(name, map.getOrDefault(name, 0) + 1);
            }

            for (String name : completion) {
                map.put(name, map.get(name) - 1);
            }

            for (String key : map.keySet()) {
                if (map.get(key) > 0) {
                    answer = key;
                    break;
                }
            }
        System.out.println(answer);
    }
    // getOrDefault = 중복된 key 값을 체크 하느것
}

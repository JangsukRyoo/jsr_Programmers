package lvl2;

import java.util.HashMap;

public class OpenChat {
    public static void main(String args[]){
        String [] record ={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        HashMap<String, String> users = new HashMap<String, String>();

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<record.length; i++) {
            String s = record[i];
            String[] arr = s.split(" ");
            switch (arr[0]) {
                case "Enter":
                    sb.append((arr[1])).append("님이 들어왔습니다.-");
                    users.put(arr[1], arr[2]);
                    break;
                case "Leave":
                    sb.append((arr[1])).append("님이 나갔습니다.-");
                    break;
                case "Change":
                    users.put(arr[1], arr[2]);
                    break;
            }
        }

            String str = sb.toString();
            String[] answer = str.split("-");

            for(int i = 0; i < answer.length; i++) {
                String key = answer[i].substring(0, answer[i].indexOf("님"));
                answer[i] = answer[i].replace(key, users.get(key));
            }

        System.out.println(answer);

    }
}

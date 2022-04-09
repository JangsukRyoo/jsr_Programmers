package RandomPractice;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    public static void main(String args[]){
    String tString = "this is {template} {template} is {state}";
    String[][] variables = {{"template", "{state}"}, {"state", "{template}"}};
//    String tString ="{a} {b} {c} {d} {i}";
//    String[][] variables ={{"b", "{c}"}, {"a", "{b}"}, {"e", "{f}"}, {"h", "i"}, {"d", "{e}"}, {"f", "{d}"}, {"c", "d"}};
    List<String> listStop = new ArrayList<>();
    listStop.add(tString);

    String tmp =tString;
        String answer ="";
        while(true){

            for(int i = 0; i<variables.length; i++) {
                String a = "{" + variables[i][0] + "}";
                tmp = tmp.replace(a, variables[i][1]);

                System.out.println(tmp);
                if (listStop.contains(tmp) || tmp.indexOf("{") == -1) {
                    answer = tmp;
                    break;
                } else {
                    listStop.add(tmp);
                }
            }
        }

    }
}

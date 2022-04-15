package RandomPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class makeEmail {
    public static void main(String args[]) {
        String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Panny Parker";
        String c ="Example";
        String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
        String[] name = S.split(", ");
        HashMap<String, Integer> nameMap = new LinkedHashMap<String, Integer>();
        String result = "";
        String comma = ", ";
        String email = "@" + c.toLowerCase() +".com>";

        int index = 0;

        for(String a : name){
            String[] sptName = a.split(" ");
            String iniName ="";

            iniName = Character.toString(sptName[0].charAt(0));

            if(sptName.length >=3) {
                iniName += Character.toString(sptName[1].charAt(0));
            }

            if(sptName[sptName.length - 1].length() >= 8) {
                iniName += sptName[sptName.length - 1].replaceAll(match,"").substring(0, 8);
            }else{
                iniName += sptName[sptName.length - 1];
            }
            iniName = " <"+iniName.toLowerCase();
            nameMap.put(iniName, nameMap.getOrDefault(iniName,-1)+1);

            if(index == name.length-1){comma ="";}

            if(nameMap.getOrDefault(iniName,-1) == 0){
                result +=a +iniName+email+comma;
            }else {
                result +=a +iniName+nameMap.getOrDefault(iniName,0)+email+comma;
            }

            System.out.println(index);

            System.out.println(name.length-1);
            index ++;
        }
        System.out.println(S);
        System.out.println(result);
    }
}

package lvl1;

public class basicString {
    public static void main(String args[]){
        String str = "11223";
        boolean answer = true;

        if(str.length() == 4 || str.length() == 6){
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    answer = false;
                }else if(str.charAt(i) == 'e'){
                    answer = false;
                }
            }
        }else{
            answer = false;
        }

        System.out.println(answer);
    }
}


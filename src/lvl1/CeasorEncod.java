package lvl1;

public class CeasorEncod {
    public static void main (String args[]){
            String s = "AaZz";
            int n = 25;
            String result = "";

            char[] a = s.toCharArray();
            for(int i = 0; i < a.length; i++) {
                char ch = a[i];
                int num = (int)a[i];

                //대문자
                if(ch == ' '){
                 result += ch;
                 continue;

                } else if(num < 97){
                    if((num + n) > 90 ){
                        int add = (num + n - 91);
                        num = 65 + add;
                        result += (char) num;
                    }else{
                        result +=(char) (num +n);
                    }

                //소문자
                }else{
                    if((num +n)>122) {
                        int add = (num + n - 123);
                        num =  97 +add;
                        result += (char) num;

                    }else{
                        result += (char)(num +n);
                    }
                }
            }


        System.out.println(result);
    }
}

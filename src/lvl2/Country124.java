package lvl2;

public class Country124 {
    public static void main(String args[]){
    int n = 10;
    String answer ="";
    String[] num ={"4","1","2"};
    while(n >0){
        answer = num[n%3]+answer;
        n = (n -1)/3;
    }
        System.out.println(answer);
    }
}

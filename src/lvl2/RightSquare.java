package lvl2;

public class RightSquare {
    public static void main(String args[]){
        long w = 8;
        long h = 12;
        long answer = 0;
        for(int i=0; i<w; i++){
            answer += h*i/w;
        }
        System.out.println(answer*2);

    }
}

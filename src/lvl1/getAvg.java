package lvl1;

public class getAvg {
    public static void main(String[] args){
        int[] arr = new int[3];

        double avg = 0;
        double sum = 0;

        for(int i= 0; i<arr.length; i++){
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }
}

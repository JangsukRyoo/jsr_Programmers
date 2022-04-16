package lvl1;

import java.util.HashSet;

public class Phoneketmon {

    public static int result(String[] args) {
        int [] nums = {3,1,2,3};
        int canSelect = nums.length/2;
        HashSet<Integer> pocket = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(pocket.size()<canSelect){
                pocket.add(nums[i]);
            }
        }
        return pocket.size();
    }

    // HashSet은 중복을 허용하지 않으므로, 고를수 있는 숫자의 만큼 렌덤으로 넣을수있다.
}

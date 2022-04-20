import java.util.ArrayList;
import java.util.List;

class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int temp:candies){
            if (temp>max){
                max = temp;
            }
        }

        List<Boolean> res = new ArrayList<>();
        for (int i : candies) {
            res.add(i + extraCandies >= max);
        }
        return res;
    }
}

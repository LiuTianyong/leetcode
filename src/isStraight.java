import java.util.*;

public class isStraight {
    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        int max = 0;
        for (int temp:candies){
            if (temp>max){
                max = temp;
            }
        }

        List<Boolean> list = new ArrayList<>();
        for (int i : candies) {
            list.add(i + extraCandies >= max);
        }
    }

}

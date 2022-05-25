import java.util.Arrays;

public class sortedSquares {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
    static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0;i < nums.length ;i++){
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        System.out.println();
        return res;
    }
}

import java.util.Arrays;

public class medianSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647};
        int k = 2;

        double[] res = new double[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            res[i] = median(nums, i, k);
        }
        System.out.println();
    }

    public static double median(int[] nums, int i, int k) {

        int[] arr = new int[k];
        System.arraycopy(nums, i, arr, 0, k);
        Arrays.sort(arr);
        if (k % 2 == 0){
            return ((arr[(k-1)/2] + arr[(k-1)/2 +1]) / 2.0) ;
        }else {
            return arr[k/2];
        }
    }
}

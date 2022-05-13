import java.util.Arrays;

public class maxJumps {
    public static void main(String[] args) {
        int[] arr = {6,4,14,6,8,13,9,7,10,6,12};
        int d = 2;

        int res = 0;
        for (int i = 0; i < arr.length;i++){
            int [] dp = new int[arr.length];
            res = Math.max(res,getMaxFromOnePoint(arr,dp,i,d));
        }
        System.out.println(res);
    }

    static int getMaxFromOnePoint(int arr[],int dp[],int p,int d){
        if(dp[p] != 0) {
            return dp[p];   //当前柱子已经计算过，直接返回它的值
        }
        // 如果没有，分别计算它往左和往右跳一次可以得到的最大值
        int leftMax = 0;
        int l = 1;  // 往左跳的距离
        while(p-l>=0 && l<=d){
            if(arr[p-l]>=arr[p]){   //遇到了高柱子挡路，只能结束
                break;
            } else{
                if(dp[p-l]==0) {
                    dp[p-l] = getMaxFromOnePoint(arr,dp,p-l,d);
                }
                leftMax = Math.max(leftMax, dp[p-l]);
                l++;
            }
        }
        // 同理右边
        int rightMax = 0;
        int r = 1;
        while(p+r<arr.length && r<=d){
            if(arr[p+r]>=arr[p]){
                break;
            } else{
                if(dp[p+r]==0) {
                    dp[p+r] = getMaxFromOnePoint(arr,dp,p+r,d);
                }
                rightMax = Math.max(rightMax, dp[p+r]);
                r++;
            }
        }
        dp[p] = Math.max(leftMax, rightMax)+1;
        return dp[p];
    }
}

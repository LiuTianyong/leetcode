import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1531 {
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], n);
        }
        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                int same = 0;
                int delete = 0;
                for (int l = i; l >= 1; l--) {
                    if (s.charAt(l - 1) == s.charAt(i - 1)) {
                        same++;
                    } else {
                        delete++;
                    }
                    if (j - delete >= 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[l - 1][j - delete] + calc(same) + 1);
                    }
                }
                if (j >= 1) {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
                }
            }
        }
        return dp[n][k];
    }

    private int calc(int n) {
        if (n == 1) {
            return 0;
        }
        if (n > 1 && n < 10) {
            return 1;
        }
        if (n >= 10 && n < 100) {
            return 2;
        }
        return 3;
    }
}

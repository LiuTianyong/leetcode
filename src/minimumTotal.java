import java.util.ArrayList;
import java.util.List;

public class minimumTotal {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> line1 = new ArrayList<>();
        line1.add(-1);
        triangle.add(line1);

        List<Integer> line2 = new ArrayList<>();
        line2.add(2);
        line2.add(3);
        triangle.add(line2);

        List<Integer> line3 = new ArrayList<>();
        line3.add(1);
        line3.add(-1);
        line3.add(-1);
        triangle.add(line3);

//        List<Integer> line4 = new ArrayList<>();
//        line4.add(4);
//        line4.add(1);
//        line4.add(8);
//        line4.add(3);
//        triangle.add(line4);

        /**
         * 2
         * 3 4
         * 6 5 7
         * 4 1 8 3
         */

        /**
         * -1
         * 2  3
         * 1 -1 -3
         */

        /**
         * -1
         * 2  3
         * 1  -1 -1
         */

        /**
         * 2
         * 3 4
         * 6 5 9
         * 4 4 8 0
         */
        int n = triangle.size();
        int [] dp = new int [n];
        for(int i = 0 ; i < n ; i++){
            dp[i] = triangle.get(n-1).get(i);
        }
        for(int i = n-2 ; i >= 0 ; i--){
            for(int j = 0 ; j <= i ; j++){
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j] , dp[j+1]);
            }
        }
//        return dp[0];

    }
}

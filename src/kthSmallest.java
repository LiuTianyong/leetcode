public class kthSmallest {
    public static void main(String[] args) {

        /**
         * 1   5  9
         * 10 11 13
         * 12 13 15
         */
        int[][] matrix = {
                {1, 2},
                {1, 3}};
        int k = 2;
        int n = matrix.length;

        int res1 = 0;
        for (int i = 0;i < n;i++){
            if (i * n < k && (i+1) * n >= k){
                res1 = matrix[i][k-i*n-1];
            }
        }
        int res2 = 0;
        for (int i = 0;i < n;i++){
            if (i * n < k && (i+1) * n >= k){
                res2 = matrix[k-i*n-1][i];
            }
        }
        int res = Math.min(res1, res2);
        System.out.println(res);
    }
}

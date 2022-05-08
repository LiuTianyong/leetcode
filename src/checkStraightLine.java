public class checkStraightLine {
    public static void main(String[] args) {
        // [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
        int[][] coordinates = {
                {0,0},
                {2,1},
                {0,-1}
        };

        double k = ((double) coordinates[1][1] - (double)coordinates[0][1]) / (double)(coordinates[1][0] - (double)coordinates[0][0]);

        for (int i = 2;i < coordinates.length; i++){
            System.out.println(coordinates[i][1]);
            if (coordinates[i][1] < 0.0 ){
                System.out.println(coordinates[i][1]);
            }
            double res = ((double)coordinates[i][1] - (double)coordinates[0][1]) / (double)(coordinates[i][0] - (double)coordinates[0][0]);

            if (res != k){

            }
        }


    }
}

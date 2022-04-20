public class maxAbsValExpr {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4}, arr2 = new int[]{-1,4,5,6};

        int amax = Integer.MIN_VALUE;
        int bmax = Integer.MIN_VALUE;
        int cmax = Integer.MIN_VALUE;
        int dmax = Integer.MIN_VALUE;
        int amin = Integer.MAX_VALUE;
        int bmin = Integer.MAX_VALUE;
        int cmin = Integer.MAX_VALUE;
        int dmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            amax = Math.max(arr1[i] + arr2[i] + i, amax);
            amin = Math.min(arr1[i] + arr2[i] + i, amin);
            bmax = Math.max(arr1[i] + arr2[i] - i, bmax);
            bmin = Math.min(arr1[i] + arr2[i] - i, bmin);
            cmax = Math.max(arr1[i] - arr2[i] - i, cmax);
            cmin = Math.min(arr1[i] - arr2[i] - i, cmin);
            dmax = Math.max(arr1[i] - arr2[i] + i, dmax);
            dmin = Math.min(arr1[i] - arr2[i] + i, dmin);
        }
//        return Math.max(Math.max(amax - amin, bmax - bmin), Math.max(cmax - cmin, dmax - dmin));
    }
}

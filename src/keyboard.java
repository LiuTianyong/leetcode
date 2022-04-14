public class keyboard {
    public static void main(String[] args) {
        int k = 1, n = 2;
        k = 26 * n;

        System.out.println(C(k,n));
//        System.out.println(C(k,n));
//        System.out.println(C(k,n) * n);
    }

    public static Long jcT(int n,int c){
        Long sum = 1L;
        while (c-- > 0) {
            sum = sum * n--;
        }
        return sum;
    }

    public static Long jc(int n){
        Long sum = 1L;
        while (n > 0) {
            sum = sum * n--;
        }
        return sum;
    }

    public static Long C(int n,int m){
        // 计算组合数
        return jcT(n,m) / jc(m);
    }

}

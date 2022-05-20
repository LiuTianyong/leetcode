public class trailingZeroes {
    public static void main(String[] args) {
        int n = 3;
        trailingZeroes(n);
    }
    static int trailingZeroes(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}

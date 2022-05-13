public class decode {
    public static void main(String[] args) {
        int[] encoded = {6,5,4,6};
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
            System.out.println(total);
        }
    }
}

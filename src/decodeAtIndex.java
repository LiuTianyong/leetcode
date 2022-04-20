public class decodeAtIndex {
    public String decodeAtIndex(String S, int K) {
        int n = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                int ic = c - '0';
                if ((K - 1) / ic >= n) {
                    n *= ic;
                } else {
                    return decodeAtIndex(S, (K - 1) % n + 1);
                }
            } else {
                if (++n == K) {
                    return String.valueOf(c);
                }
            }
        }

        return "";
    }
}

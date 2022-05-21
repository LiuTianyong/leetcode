public class canWinNim {
    public static void main(String[] args) {
        canWinNim(4);
    }
    static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

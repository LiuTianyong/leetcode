class Solution {
    public String replaceDigits(String s) {
        char[] sc = s.toCharArray();

        if (sc.length % 2 == 0){
            for (int i = 0;i < sc.length;i = i + 2){
                sc[i+1] = shift(sc[i],sc[i+1] - '0');
            }
        }else {
            for (int i = 0;i < sc.length - 1;i = i + 2){
                sc[i+1] = shift(sc[i],sc[i+1] - '0');
            }
        }

        return new String(sc);
    }
    public static char shift(char c,int i){
        int res  = c + i;
        return (char) res;
    }
}
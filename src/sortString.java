public class sortString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        int[] memory = new int[26];

        for (char c: s.toCharArray()){
            memory[c - 'a']++;
        }
        int length = s.length();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 26; j++) {
                if (memory[j] != 0) {
                    str.append((char) (j + 'a'));
                    memory[j]--;
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (memory[j] != 0) {
                    str.append((char) (j + 'a'));
                    memory[j]--;
                }
            }
        }
        System.out.println(str);
    }
}

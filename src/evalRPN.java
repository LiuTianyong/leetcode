import javax.sound.midi.Soundbank;

public class evalRPN {
    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};

        String[] stack = new String[tokens.length];
        int top = 0;

        String fh = "+-*/";

        for (int i = 0;i < tokens.length;i++){
            if (fh.contains(tokens[i])){
                int a = Integer.parseInt(stack[--top]);
                int b = Integer.parseInt(stack[--top]);
                int res = 0;
                if ("+".equals(tokens[i])){
                    res = b + a;
                }
                if ("-".equals(tokens[i])){
                    res = b - a;
                }
                if ("*".equals(tokens[i])){
                    res = b * a;
                }
                if ("/".equals(tokens[i])){
                    res = b / a;
                }
                stack[top++] = String.valueOf(res);
            }else {
                stack[top++] = tokens[i];
            }
        }

        System.out.println(stack[0]);
    }
    public int evalRPN(String[] tokens) {

        String[] stack = new String[tokens.length];
        int top = 0;

        String fh = "+-*/";

        for (int i = 0;i < tokens.length;i++){
            if (fh.contains(tokens[i])){
                int a = Integer.parseInt(stack[--top]);
                int b = Integer.parseInt(stack[--top]);
                int res = 0;
                if ("+".equals(tokens[i])){
                    res = b + a;
                }
                if ("-".equals(tokens[i])){
                    res = b - a;
                }
                if ("*".equals(tokens[i])){
                    res = b * a;
                }
                if ("/".equals(tokens[i])){
                    res = b / a;
                }
                stack[top++] = String.valueOf(res);
            }else {
                stack[top++] = tokens[i];
            }
        }
        return Integer.parseInt(stack[0]);
    }
}



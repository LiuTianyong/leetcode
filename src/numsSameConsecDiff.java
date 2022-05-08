import java.util.ArrayList;
import java.util.List;

public class numsSameConsecDiff {
    public static void main(String[] args) {
        int n = 3;
        int k = 7;

        int[] nums = new int[10];

        int j = 0;
        for (int i = 0; i <= 9; i++) {
            if (i + k <= 9) {
                nums[j++] = i;
                nums[j++] = i + k;
            } else {
                break;
            }
        }

        List<Integer> resArr = new ArrayList<>();
        for (int i = 0; i < j; i++) {
            int a = nums[i++], b = nums[i], res = 1;
            int num1 = a,num2 = b;
            for (int l = 1; l < n; l++) {
                res = res * 10 +res;
                if (l % 2 == 0) {
                    num1 = num1 * 10 + a;
                    num2 = num2 * 10 + b;
                } else {

                    num1 = num1 * 10 + b;
                    num2 = num2 * 10 + a;
                }
            }
            if (num1 > res){
                resArr.add(num1);
            }
            if (num2 > res){
                resArr.add(num2);
            }
        }

        int[] resNumbers = new int[resArr.size()];
        for (int i = 0;i < resNumbers.length;i++){
            resNumbers[i] = resArr.get(i);
        }
        System.out.println();

    }
}

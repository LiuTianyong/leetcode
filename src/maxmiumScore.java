import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class maxmiumScore {
    public static void main(String[] args) {
        int[] cards = {7,1,5,8,3,3,1,2};
        int cnt = 7;
        maxmiumScore(cards,cnt);
    }

    static int maxmiumScore(int[] cards, int cnt) {
        // 先排序
        Arrays.sort(cards);
        int sum = 0;
        int index = cards.length - 1;
        while(cnt > 0){
            sum += cards[index--];
            cnt--;
        }
        // 刚好是最大的cnt个数之和就返回
        if(sum % 2 == 0){
            return sum;
        }
        for(int i = index;i >= 0;i--){
            // 遍历最大的cnt个数进行替换
            for(int j = index + 1;j < cards.length;j++){
                sum -= cards[j];
                sum += cards[i];
                if(sum % 2 == 0){
                    return sum;
                }
                sum -= cards[i];
                sum += cards[j];
            }
        }
        return 0;
    }
}

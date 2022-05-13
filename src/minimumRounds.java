import java.util.HashMap;
import java.util.Map;

public class minimumRounds {
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,2,4,4,4,4,4};

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i < tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0) + 1);
        }
        System.out.println();
    }
}

public class test {
    public static void main(String[] args) {
        int [] nums = {6,2,1,2,4,5};
        long a = 0;
        long b = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            a = Math.max(nums[i] + b,a);
            b = Math.max(a - nums[i],b);
        }
        System.out.println(Math.max(a,b));
//        return Math.max(a,b);
    }
}

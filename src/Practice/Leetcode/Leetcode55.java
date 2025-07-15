package Practice.Leetcode;

public class Leetcode55 {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int max_reach = 0;
        for(int i = 0; i < size; i++){
            //if Index value is greater than max_reach
            if(i > max_reach){
                return false;
            }
            //If reachable
            max_reach = Math.max(max_reach, i + nums[i]);
            if(max_reach > size - 1) return true;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode55 obj = new Leetcode55();
        int[] input = {3,2,1,0,4};
        System.out.println(obj.canJump(input));
    }
}

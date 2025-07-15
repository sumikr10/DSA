package Practice.Leetcode;

import java.util.Arrays;

public class Leetcode_32 {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        int left = 0;
        int right = size - 1;
        boolean found = false;
        int foundAt = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                foundAt = mid;
                found = true;
                break;
            }
        }
        if(!found) return new int[]{-1,-1};

        //Check Left Side if it has any more target
        int start = foundAt;
        for(int i = foundAt - 1; i >= 0; i--){
            if(nums[i] == target){
                start = i;
                continue;
            }else{
                break;
            }
        }

        //Check Right Side
        int end = foundAt;
        for(int j = foundAt + 1; j <= size -1 ; j++){
            if(nums[j] == target){
                end = j;
                continue;
            }else{
                break;
            }
        }

        return new int[]{start,end};
    }

    public static void main(String[] args) {
        Leetcode_32 obj = new Leetcode_32();
        int[] input = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(obj.searchRange(input, target)));
    }
}

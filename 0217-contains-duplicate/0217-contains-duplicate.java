import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int s = 0;
        int e = 1;
        int l = nums.length - 1;

        while (e <= l) {
            if (nums[s] == nums[e]) {
                return true; 
            }
            s++;
            e++;
        }

        return false; 
    }
}

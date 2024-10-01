class Solution {
    public int search(int[] nums, int target) {
        int target1 = -1;
        for(int i = 0; i<nums.length;i++){
            if(target==nums[i]){
                target1=i;
            }
        }
        return target1;
    }
}
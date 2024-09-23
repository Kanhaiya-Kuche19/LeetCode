class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};
        int ind = -1;
        for(int i = 0; i<nums.length; i++){

            if(nums[i] == target && arr[0] == -1){
                ind = i;
                arr[0] = ind;

            }
            if(nums[i] == target && arr[0] != -1){
                ind = i;
                arr[1] = ind;
            }
        }
        if(ind==-1){
            return arr;
        }
        return arr;
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] intArray = new int[nums.length];
        int cnt = 0;
        for(int i=0; i<nums.length;i++){
            for(int j = 0; j<nums.length; j++){
                if(i==j){
                    continue;
                }else{
                    int a = nums[i];
                    int b = nums[j];
                    if(a>b){
                        cnt++;
                    }
                }
            }
            intArray[i]=cnt;
            cnt=0;
        }

        return intArray;
    }
}
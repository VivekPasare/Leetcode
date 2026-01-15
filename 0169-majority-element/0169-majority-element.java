class Solution {
    public int majorityElement(int[] nums) {
        //sort
        Arrays.sort(nums);
        //frequency count

        int count=1;
        int ans=nums[0];
        if(nums.length==1){
                return ans;

            }
            else{
                for(int i=1;i<nums.length;i++){
            
            if(nums[i-1]==nums[i]){
                count++;
            }
            else{
                count=1;
                ans=nums[i];
            }

            if(count>nums.length/2){
                return ans;
            }

        }

            }
        
        return -1;
    }
}
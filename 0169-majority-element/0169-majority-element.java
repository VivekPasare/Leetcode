class Solution {
    public int majorityElement(int[] nums) {
        //sort array

        Arrays.sort(nums);
        int mid=nums.length/2;

        return nums[mid];


    }
}
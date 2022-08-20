class Solution {
    public int singleNumber(int[] nums) {
        int answer=0;
        for(int i=0; i<nums.length; i++)
            answer^=nums[i]; //xor operation
        return answer; 
    }
}
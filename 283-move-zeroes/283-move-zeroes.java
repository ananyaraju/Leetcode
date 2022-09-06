class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        int n=nums.length;
        while (i<n) {
            if (nums[i]!=0) { 
                nums[j++] = nums[i];
            }
            i++;
        }
        for (i=j; i<n; i++) {
            nums[i] = 0;
        }
    }
}
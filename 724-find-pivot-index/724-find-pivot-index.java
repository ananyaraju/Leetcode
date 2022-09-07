class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0, sum2 = 0;
        int j = 0;
        int index = -1;
        for (int i=0; i<nums.length; i++) {
            if (i==0) {
                sum1 = 0;
                for (int l=1; l<nums.length; l++) {
                    sum2 += nums[l];
                }
            }            
            else {
                while (j<i) {
                    sum1 += nums[i-1];
                    j++;
                }
                sum2 = 0;
                for (int k=i+1; k<nums.length; k++) {
                    sum2 += nums[k];
                }
            }
            if (sum1 == sum2) {
                index = i;
                break;
            }
        }
        return index;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        int[] arr = new int[2];
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (i!=j) {
                    temp = nums[i]+nums[j];
                    if (temp==target) {
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
class Solution
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        int count=1;
        if (nums.length==1)
        {
            return nums[0];
        }
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                if (count>nums.length/2)
                    return nums[i-1];
                else
                    count=1;
            }
            if (count>nums.length/2)
                return nums[i-1];
        }
        return 0;
    }
}
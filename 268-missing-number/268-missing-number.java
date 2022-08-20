class Solution
{
    public int missingNumber(int[] nums)
    {
        Arrays.sort(nums); int x=0;
        if (nums.length==1)
		{
		    if (nums[0]==0)
		        x=1;
		    else
		        x=0;
		}
        for (int i=1; i<nums.length; i++)
        {
            if (nums[0]==0)
            {
                if (nums[i]==nums[i-1]+1)
                    x=nums.length;
                else
                {
                    x=i; break;
                }
            }
            else
                x=0;
        }
        return x;
    }
}
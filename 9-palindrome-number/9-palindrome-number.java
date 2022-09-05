class Solution
{
    public boolean isPalindrome(int x)
    {
        int temp = 0;
        int num = x;
        int result = 0;
        while (x>0)
        {
            temp = x%10;
            result = result*10 + temp;
            x = x/10;
        }
        if (result == num)
            return true;
        else
            return false;
    }
}
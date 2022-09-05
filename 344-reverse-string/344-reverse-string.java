class Solution
{
    public void reverseString(char[] s)
    {
        int j = s.length-1;
        char[] revString = new char[s.length];
        for (int i=0; i<s.length; i++)
        {
            revString[j] = s[i];
            j--;
        }
        int k = 0;
        for (int i=0; i<revString.length; i++)
        {
            s[k++] = revString[i];
        }
    }
}
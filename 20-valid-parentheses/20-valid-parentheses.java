class Solution
{
    public boolean isValid(String s)
    {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars)
        {
            if (c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char ch = stack.peek();
                    if (c==')' && ch=='(' || c==']' && ch=='[' || c=='}' && ch=='{')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }        
                }
            }
        }
        return stack.isEmpty();
    }
}
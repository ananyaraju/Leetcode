class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length == 0)
            return "";
        if (length == 1)
            return strs[0];
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[length-1].length());
        int i = 0; String pre;
        while (i<end && strs[0].charAt(i)==strs[length-1].charAt(i))
            i++;
        pre = strs[0].substring(0,i);
        return pre;
    }
}
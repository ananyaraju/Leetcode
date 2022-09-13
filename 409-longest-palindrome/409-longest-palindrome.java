class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            }
            else {
                set.add(s.charAt(i));
            }
        }
        int sub = set.size();
        if (sub > 0) {
            sub--;
        }
        return s.length() - sub;
    }
}
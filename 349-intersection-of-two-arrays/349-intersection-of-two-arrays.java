class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (answer.contains(nums1[i])==false)
                        answer.add(nums1[i]);
                }
            }
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
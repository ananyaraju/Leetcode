class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int square;
        for (int i = 0; i < nums.length; i++) {
            square = (int)Math.pow(nums[i],2);
            arr[i] = square;
        }
        Arrays.sort(arr);
        return arr;
    }
}
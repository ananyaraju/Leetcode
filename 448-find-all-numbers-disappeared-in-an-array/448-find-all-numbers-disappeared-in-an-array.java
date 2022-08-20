class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer=new ArrayList<>();
        int[] list=new int[nums.length];
        for (int i : nums)
            list[i-1]++;
        for (int i=0; i<nums.length; i++)
            if(list[i] == 0)
                answer.add(i+1);
        return answer;
    }
}
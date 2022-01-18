class Solution {
    public int[] runningSum(int[] nums) 
    {
        int count = 0;
        int res[] = new int[nums.length];
        for(int i = 0;i < nums.length; i++)
        {
            count = count + nums[i];
            res[i] = count;
        }
        return res;
    }
}
class Solution {
    public int minMoves(int[] nums) 
    {
        int min = nums[0], steps = 0;
        for(int i = 1; i<nums.length; i++)
        {
            if(min > nums[i])
            {
                min = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++)
        {
            steps = steps + nums[i] - min;
        }
        return steps;
    }
}
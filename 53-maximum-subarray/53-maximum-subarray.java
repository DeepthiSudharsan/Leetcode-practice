class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max_val = Integer.MIN_VALUE, curr_max = 0, start = 0, end = 0, s = 0;
        for(int i = 0; i < nums.length; i++)
        {
            curr_max = curr_max + nums[i];
            if(max_val < curr_max)
            {
                max_val = curr_max;
                start = s;
                end = i;
            }
            if(curr_max < 0)
            {
                curr_max = 0;
                s = i + 1;
            }
        }
        return max_val;
        
    }
}
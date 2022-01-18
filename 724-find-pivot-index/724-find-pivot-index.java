class Solution {
    public int pivotIndex(int[] nums) 
    {
        int left_count = 0, right_count = 0, pivot = -1;
        for(int i = 1; i < nums.length; i++)
        {
            right_count = right_count + nums[i];
        }
        for(int j = 0; j < nums.length; j++)
        {
                if(left_count == right_count)
                {
                    pivot = j;
                    break;
                }
                else if(j == nums.length-1)
                {
                    if(left_count == 0)
                    {
                        pivot = j;
                        break;
                    }
                }
                else
                {
                    left_count = left_count + nums[j];
                    right_count = right_count - nums[j + 1];
                }
        }
        return pivot;
    }
}
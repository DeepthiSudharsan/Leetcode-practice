class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = nums[i] * nums[i];
        }
        int temp = 0;
        for(int k = 0; k < nums.length; k++)
        {
            for(int j = 0; j < nums.length - 1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
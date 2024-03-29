class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int left = 0, right = nums.length - 1;
        int res[] = new int[nums.length];
        for(int i = nums.length - 1; i >=0; i--)
        {
            if(Math.abs(nums[left]) >= Math.abs(nums[right]))
            {
                res[i] = nums[left] * nums[left];
                left = left + 1;
            }
            else
            {
                res[i] = nums[right] * nums[right];
                right = right - 1;
            }
        }
        return res;
    }
}
class Solution {
    public int maximumProduct(int[] nums) 
    {
        int temp = 0;
        int maxval = 0;
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = 0; j < nums.length-1-i;j++)
            {
                if(nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
        int m1 = nums[0]*nums[1]*nums[nums.length-1];
        int m2 = nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        int m3 = nums[0]*nums[1]*nums[2];
        if((m1 >= m2) && (m1 >= m3))
        {
            maxval = m1;
        }
        else if((m2 >= m3) && (m2 >= m1))
        {
            maxval = m2;
        }
        else
            maxval = m3;
        return maxval;
    }
}
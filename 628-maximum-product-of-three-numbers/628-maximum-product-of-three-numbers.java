class Solution {
    public int maximumProduct(int[] nums) 
    {
        int temp = 0;
        int maxval = 0;
        Arrays.sort(nums);        
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
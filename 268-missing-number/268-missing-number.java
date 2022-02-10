class Solution {
    public int missingNumber(int[] nums) 
    {
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }
        return (nums.length * (nums.length + 1)/2) - sum;
    //     int flag = 0; 
    //     for(int i = 0; i <= nums.length ; i++)
    //     {
    //         for(int j = 0; j < nums.length;j++)
    //         {
    //             if(i == nums[j])
    //             {
    //                 flag = 1;
    //                 break;
    //             }
    //         }
    //         if(flag == 0)
    //         {
    //             flag = i;
    //             break;
    //         }
    //         else
    //         {
    //             flag = 0;
    //         }
    //     }
    //     return flag;
    }
}
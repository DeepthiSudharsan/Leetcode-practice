class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        if(n != 0)
        {
            int nums[] = new int[m];
            for(int i = 0; i < m;i++)
            {
                nums[i] = nums1[i];
            }
            
            int ptr1 = 0, ptr2 = 0;
            for(int j = 0; j < nums1.length; j++)
            {
                if((ptr1 < m) && (ptr2 < n))
                {
                    if(nums[ptr1] > nums2[ptr2])
                    {
                        nums1[j] = nums2[ptr2 ++];
                    }
                    else
                    {
                         nums1[j] = nums[ptr1 ++];
                    }
                }
                else if(ptr1 >= m)
                {
                    nums1[j] = nums2[ptr2 ++];
                }
                else
                {
                    nums1[j] = nums[ptr1 ++];
                }
            }
        }
    }
}
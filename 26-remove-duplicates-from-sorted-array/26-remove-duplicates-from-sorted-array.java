class Solution {
    public int removeDuplicates(int[] nums) 
    {
        HashMap<Integer, Integer> occurences = new HashMap<Integer,Integer>();
        int j = 0, count = 0;
        for(Integer i : nums)
        {
            if(!occurences.containsKey(i))
            {
                occurences.put(i,1);
                nums[j++] = i;
                count = count + 1;
            }
        }
        return count;
    }
}
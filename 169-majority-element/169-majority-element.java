class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        int majority = 0;
        for(Integer i : nums)
        {
            if(count.containsKey(i))
            {
                count.put(i,count.get(i) + 1);
            }
            else
            {
                count.put(i,1);
            }
        }
        for(Integer i : nums)
        {
            if(count.get(i) > nums.length/2)
            {
                majority = i;
            }
        }
        return majority;
    }
}
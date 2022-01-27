class Solution {
    public int[] countBits(int n) 
    {
        int res[] = new int[n+1];
        res[0] = 0;
        int offset = 1; // Initially offset is 1
        for(int i = 1;i < n+1;i ++)
        {
            if(offset * 2 == i)
                offset = i; // update offset
            res[i] = 1 + res[i - offset];
        }
        return res;
        
    }
}
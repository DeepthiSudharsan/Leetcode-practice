class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        boolean ptwo = false;
        if(n == 1)
        {
            ptwo = true;
        }
        else if(((n & (n-1)) == 0) && (n > 0))
        {
            ptwo = true;
        }
        return ptwo;
    }
}
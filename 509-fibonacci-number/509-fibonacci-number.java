class Solution {
    public int fib(int n) 
    {
        int elm1 = 0, elm2 = 1, temp = 0, val = 0;
        if(n == 0)
        {
            val = 0;
        }
        if(n == 1)
        {
            val = 1;
        }
        else
        {
            for(int i=2; i<=n; i++)
            {
                temp = elm1;
                elm1 = elm2;
                elm2 = elm1 + temp;
                val = elm2;
            }
        }
        return val;
                        
    }
}
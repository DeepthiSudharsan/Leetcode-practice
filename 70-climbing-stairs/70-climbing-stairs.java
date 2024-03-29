class Solution {
    // HashMap<Integer,Integer> steps = new HashMap<Integer,Integer>();
    public int climbStairs(int n) 
    {
    //     int step_count = 0;
    //     if(n == 1)
    //     {
    //         return 1;
    //     }
    //     else if(n == 2)
    //     {
    //         return 2;
    //     }
    //     else
    //     {
    //         if(steps.containsKey(n))
    //         {
    //             step_count = steps.get(n);
    //         }
    //         else
    //         {
    //             step_count = climbStairs(n-1) + climbStairs(n-2);
    //             steps.put(n,step_count);
    //         }
    //     }
    //     return step_count;
        int ways[] = new int[n+1];

        ways[1] = 1;
        if(n > 1)
        {
            ways[2] = 2;

            for(int i = 3 ; i < n+1 ; i++) 
            {
                ways[i] = ways[i-1] + ways[i-2];
            }

        }
        
        return ways[n];
    
    }
}
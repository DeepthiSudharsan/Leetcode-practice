class Solution {
    public boolean isHappy(int n) 
    {
        int sum;
        boolean happy = true;
        while(true)
        {
            sum = 0;
            while(n > 0)
            {
                sum = sum + (int) Math.pow((n % 10),2);
                n = n / 10;
            }
            if(sum == 1)
            {
                happy = true;
                break;
            }
            else if((sum < 10) && (sum != 7))
            {
                happy = false;
                break;
            }
            else
            {
                n = sum;
            }
        }
        return happy;
    }
}
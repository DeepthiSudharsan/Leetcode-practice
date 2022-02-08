class Solution {
    public boolean isPalindrome(int x) 
    {
        int xrev = 0, temp = x;
        boolean palin = false;
        while(temp > 0)
        {
            xrev = (xrev * 10) + (temp % 10);
            temp = temp / 10;
        }
        if(x == xrev)
        {
            palin = true;
        }
        return palin;
    }
}
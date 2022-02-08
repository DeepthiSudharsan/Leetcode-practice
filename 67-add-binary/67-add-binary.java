class Solution {
    public String addBinary(String a, String b) 
    {
        int carryover = 0, curr = 0;
        String result = "";
        int alen = a.length(), blen = b.length();
        if(alen > blen)
        {
            for(int i = 0; i < alen-blen;i++)
            {
                b = "0" + b;
            }
        }
        else if(alen < blen)
        {
            for(int i = 0; i < blen- alen;i++)
            {
                a = "0" + a;
            }
        }
        for(int j = a.length() - 1; j>=0;j--)
        {
            curr = Character.getNumericValue(a.charAt(j)) + Character.getNumericValue(b.charAt(j)) + carryover;
            if( curr >= 2)
            {
                carryover = 1;
                curr = curr - 2;
            }
            else
            {
                carryover = 0;
            }
            result = Integer.toString(curr) + result;
        }   
        if(carryover == 1)
        {
            result = "1" + result;
        }
        return result;
    }
}
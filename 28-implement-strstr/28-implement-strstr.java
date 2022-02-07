class Solution {
    public int strStr(String haystack, String needle) 
    {
         int occ = -1;
        String substr = "";
        if(needle == "")
        {
            occ = 0;
        }
        else
        {
            for(int i = 0; i < haystack.length() - needle.length() + 1; i++)
            {
                if(haystack.substring(i,i+needle.length()).equals(needle))
                {
                    occ = i;
                    break;
                }
            }
            
        }
        return occ;
        
    }
}
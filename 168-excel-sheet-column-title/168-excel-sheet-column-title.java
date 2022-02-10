class Solution {
    public String convertToTitle(int columnNumber) 
    {
        String result = "";
        char val;
        while(columnNumber > 0)
        {
            if(columnNumber % 26 == 0)
            {
                val = 'Z';
                result = val + result;
            }
            else
            {
                val = (char) ('A' + columnNumber % 26 - 1);
                result = val + result;
            }
            columnNumber = (columnNumber - 1)/26; // -1 because A = 0 here not 1 in index
        }
        return result;
    }
}
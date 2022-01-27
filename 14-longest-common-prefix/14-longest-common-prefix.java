class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String longest = strs[0];
        for(int i=1;i<strs.length;i++){
            //At each step compare adjacent elements
            longest = longestCommonPrefix(longest,strs[i]);
        }
        return longest;
    }
    
    /***
    ** Get the longest common prefix between 2 strings
    ***/
    private String longestCommonPrefix(String str1,String str2){
        int i=0;
        int minLen = Math.min(str1.length(), str2.length());
        while(i< minLen && str1.charAt(i) == str2.charAt(i)){
            i++;
        }
        return str1.substring(0,i);
        
    }
}
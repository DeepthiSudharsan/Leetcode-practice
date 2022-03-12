class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int[] count = new int[26];
        List<Integer> ans = new ArrayList<>();
        for (char c: p.toCharArray())
        {
            count[c - 'a']--;
        }
        for (int start = 0, end = 0, need = p.length(); end < s.length(); end++) 
        {
            if (count[s.charAt(end) - 'a']++ < 0)
            {
                need--;
            }
            if (end - start + 1 > p.length() && --count[s.charAt(start++) - 'a'] < 0)
            {
                need++;
            }
            if (need == 0)
            {
                ans.add(start);
            }
        }
        return ans;
    }
}
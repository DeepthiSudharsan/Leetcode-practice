class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        String subs = "";
        if(s.length() > 10)
        {
            HashMap<String,Integer> occ = new HashMap<String,Integer>();
            for(int i = 0; i <= s.length() - 10;i++)
            {
                subs = s.substring(i,i+10);
                if(occ.containsKey(subs))
                {
                    occ.put(subs, occ.get(subs) + 1);
                }
                else
                {
                    occ.put(subs,1);
                }
            }
            List<String> seq = new ArrayList<String>();
            for (Map.Entry entry : occ.entrySet())
            {
                if( (int) entry.getValue() > 1)
                {
                    seq.add((String) entry.getKey());
                }
            }
            return seq;
        }
        return new ArrayList<String>(1);
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        int num = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>(); 
        for(int i = 0; i < numRows; i++)
        {
            list.add(i, new ArrayList<>());
            if(i == 0)
            {
                list.get(0).add(1);
            }
            else if(i == 1)
            {
                list.get(1).add(1);
                list.get(1).add(1);
            }
            else
            {
                list.get(i).add(1);
                for(int j = 0; j < list.get(i-1).size() - 1; j++)
                {
                    num = list.get(i-1).get(j) + list.get(i-1).get(j + 1);
                    list.get(i).add(num);
                }
                
                list.get(i).add(1);
            }
        }
        return list;    
    }
}
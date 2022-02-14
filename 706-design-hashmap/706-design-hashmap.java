class MyHashMap 
{
    private ArrayList<ArrayList<Integer>> hm;
    public MyHashMap() 
    {
        hm = new ArrayList<ArrayList<Integer>>();
        // System.out.println(hm);
    } 
    public void put(int key, int value) 
    {
        int flag = 0;
        for(int i = 0; i < this.hm.size();i++)
        {
            if(this.hm.get(i).get(0) == key)
            {
                flag = 1;
                this.hm.get(i).remove(this.hm.get(i).get(1));
                this.hm.get(i).add(1,value);
                break;
            }
        }
        if(flag == 0)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>(2);
            temp.add(key);
            temp.add(value);
            this.hm.add(temp);
        }
        
        // System.out.println(hm);
    }
    public int get(int key) 
    {
        for(int i = 0; i < this.hm.size();i++)
        {
            if(this.hm.get(i).get(0) == key)
            {
                // System.out.println(this.hm.get(0));
                return this.hm.get(i).get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) 
    {
        for(int i = 0; i < this.hm.size();i++)
        {
            if(this.hm.get(i).get(0) == key)
            {
                this.hm.remove(this.hm.get(i));
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
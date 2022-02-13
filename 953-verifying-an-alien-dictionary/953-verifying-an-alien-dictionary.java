import java.util.*;
class Solution {
    public boolean isAlienSorted(String[] words, String order) 
    {
        Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
        boolean flag = true;
        int i,ind1,ind2,mini;
        for(int j = 0; j < order.length();j++)
        {
            ht.put(order.charAt(j),j);
        }
        for(i = 0; i < words.length - 1; i++)
        {
            ind1 =  ht.get(words[i].charAt(0));
            ind2 = ht.get(words[i+1].charAt(0));
            if(ind1 > ind2)
            {
                flag = false;
                break;
            }
            else if(ind1 == ind2)
            {
                mini = Math.min(words[i].length(),words[i+1].length());
                if((words[i].length() == 1) || (words[i+1].length() == 1))
                {
                    flag = false;
                    break;
                }
                else
                {
                    for(int k = 1; k < mini; k++)
                    {
                        if(words[i].charAt(k) != words[i+1].charAt(k))
                        {                  
                            if(ht.get(words[i].charAt(k)) > ht.get(words[i+1].charAt(k)))
                            {
                                flag = false;
                                break;
                            }
                        }
                        else if((k == mini-1) && (words[i].length() != mini))
                        {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            else if(flag == false)
            {
                break;
            }
        }
        if((i == words.length - 1) && (flag == true))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
}
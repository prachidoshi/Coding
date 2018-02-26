/*
Given an array of strings, return all groups of strings that are anagrams.

 Notice
All inputs will be in lower-case

Example
Given ["lint", "intl", "inlt", "code"], return ["lint", "inlt", "intl"].

Given ["ab", "ba", "cd", "dc", "e"], return ["ab", "ba", "cd", "dc"].
*/
public class Solution {
    /*
     * @param strs: A list of strings
     * @return: A list of strings
     */
     /*
     Algorithm
     The sorted string is same for all anagrams .We store the sorted string as key and if the sort matches one of the keys in hashmap , we store original string in map for that key 
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        
        //Step 0: Define result set 
       List<String> result = new ArrayList<String>();
        
        //Step 1 : Define HashMap 
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(int i=0;i<strs.length;i++){
            String sInput = strs[i].toLowerCase();
            char[] cTemp = sInput.toCharArray();
            Arrays.sort(cTemp);
            String ns =  new String(cTemp);
            
            //store in map 
            if(map.containsKey(ns)){
                map.get(ns).add(strs[i]);
                
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(strs[i]);
                map.put(ns,al);
            }
        }
        //iterate over map and add in result if more than one element in corresponding list 
        
        for(Map.Entry<String,ArrayList<String>> entry : map.entrySet()){
            ArrayList<String> tempList = entry.getValue();
            if(tempList.size()>1){
                result.addAll(tempList);
            }
        }
        return result;
    }
}

/*
Write a method anagram(s,t) to decide if two strings are anagrams or not.
Example
Given s = "abcd", t = "dcab", return true.
Given s = "ab", t = "ab", return true.
Given s = "ab", t = "ac", return false.

Challenge 
O(n) time, O(1) extra space
*/
public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        //Solution 1: sorting method time complexity = O(nlogn) space = O(n)
       /* if(s.length()!=t.length()){
            return false;
        }
        char[] sCharSet = s.toCharArray();
        char[] tCharSet = t.toCharArray();
        Arrays.sort(sCharSet);
        Arrays.sort(tCharSet);
        return Arrays.equals(sCharSet,tCharSet);*/
        
        //Solution 2: store in constant size array but has problem if we have spaces in strings 
        /*if(s.length()!=t.length()){
            return false;
        }
        int counter[] = new int[26];
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int count:counter){
            if(count!=0)
                return false;
        }
        return true;*/
        
        //Solution 3: HashMap method which can handle any sort of characters
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //fill map with character frequency of first string 
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+1);
            }else{
                map.put(c1,1);
            }
        }
        
        //process second string and reduce the string by -1 for each known character and if the character freq is 1 , remove it from map 
        for(int i=0;i<s.length();i++){
            char c2 = t.charAt(i);
            if(map.containsKey(c2)){
                if(map.get(c2)==1){//if count of key is 1 , then remove it from map 
                    map.remove(c2);
                } else{
                    map.put(c2,map.get(c2)-1); //reduce by -1
                }
                
            }else{
                map.put(c2,-1);
            }
        }
        
        if(map.size()>0){
            return false;
        }
        return true;
        
    }
}

/*
Given k strings, find the longest common prefix (LCP).

Example
For strings "ABCD", "ABEF" and "ACEF", the LCP is "A"

For strings "ABCDEFG", "ABCEFG" and "ABCEFA", the LCP is "ABC"
*/
public class Solution {
    /*
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        //check for null condition 
        if(strs==null || strs.length==0){
            return "";
        }
        
        //check for conditio if single string in array 
        if(strs.length==1){
            return strs[0];
        }
        
        //find minimum length 
        int minLen = strs[0].length();
        
        for(String str:strs){
            if(str.length()<minLen){
                minLen = str.length();
            }
        }
        
        //do character to character comparision and if mismatch take substring to that match 
        for(int i=0;i<minLen;i++){
            for(int j=0;j<strs.length-1;j++){
                String s1 = strs[j];
                String s2 = strs[j+1];
                
                if(s1.charAt(i)!=s2.charAt(i)){
                    return s1.substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLen);
    }
}

/*Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.*/



class Solution {
    public static HashMap<Character,Integer> storeInMap(String s){
		 HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        char[] arr = s.toCharArray();
	        for(int i=0;i<arr.length;i++){
	            if(map.containsKey(arr[i])){
	                map.put(arr[i],map.get(arr[i])+1);
	            }else{
	            	 map.put(arr[i],1);
	            }
	        }
	     //print this map 
	     /* for(Entry<Character, Integer> entry : map.entrySet()) {
	    	  System.out.println(entry.getKey()+":"+entry.getValue());
	      }*/
	      return map;
	}
    public int longestPalindrome(String s) {
        //first store all the characters of string in a hashmap
        HashMap<Character,Integer> map = storeInMap(s);
    	int odd =0;
    	for(Character key: map.keySet()){
    		if(map.get(key)%2==1)
    			odd++;
    		
    	}
    	int palLength = 0;
    	palLength = (odd<1)?s.length():s.length()-(odd-1);
        return palLength;
    }
}

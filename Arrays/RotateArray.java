/*
Rotate an array of n elements to the right by k steps. 
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
O(1) space and in O(n) time

Assuming we are given {1,2,3,4,5,6} and order 2. The basic idea is:

1. Divide the array two parts: 1,2,3,4 and 5, 6
2. Reverse first part: 4,3,2,1,5,6
3. Reverse second part: 4,3,2,1,6,5
4. Reverse the whole array: 5,6,1,2,3,4

*/
public static void rotate(int[] a, int k) {
  //check for null conditions
  if(a == null || a.length == 0 || k<0){
    throw new IllegalArgumentException("Please check input");
  }
  //make sure k falls in range of n 
  if(k > a.length){
		k = k % a.length;
	}
  //split the array 
  int firstPartLength = a.length - k;
  
  //reverse first half, reverse second half and then reverse whole array
  reverse(a, 0, firstPartLength-1);
	reverse(a, firstPartLength, a.length-1);
	reverse(a, 0, a.length-1);
	
}
  public static void reverse(int[] a , start,end){
  //check for edge conditions 
  
}

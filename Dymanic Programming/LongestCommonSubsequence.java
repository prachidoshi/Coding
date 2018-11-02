/**
How to fill matrix 
        a|b|c|d|a|f
      0|0|0|0|0|0|0
    a 0|1|1|1|1|1|1
    c 0|1|1|2|2|2|2
    b 0|1|2|2|2|2|2
    c 0|1|2|3|3|3|3
    f 0|1|2|3|3|3|4


**/


package com.interview.dynamic;

/**
 http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
public class LongestCommonSubsequence {

public int lcsDynamic(char str1[],char str2[]){
int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }
        return max;
  }

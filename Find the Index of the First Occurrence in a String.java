// Problem link  - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ;i < haystack.length() - needle.length() + 1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){                        //if the first character of needle exists in haystack, only then
                if(haystack.substring(i,needle.length() + i).equals(needle)){  //check for substring
                    return i;
                }
            }
        }
        return -1;
    }
}

/* Idea :  check whether the first character of needle exists in haystack, if not return -1.
           If the character exists, check whether substring exists or not.

           Example : haystack = "sadbutsad"   needle = "sad" 

            The condition in line 5 in the above code states that the length of needle is 3 and hence the substring(sad) will not exist in haystack from 
            7th index onwards.
*/

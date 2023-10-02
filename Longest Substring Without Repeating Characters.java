// Problem link - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start = 0, maxLength = 0;
       HashMap<Character,Integer> map = new HashMap<>();
       for(int end = 0; end < s.length();end++){
           char theChar = s.charAt(end);
           if(map.containsKey(theChar)){
               start = Math.max(start,map.get(theChar) + 1);
           }
           map.put(theChar,end);
           maxLength = Math.max(maxLength,end-start+1);
       }
       return maxLength;
    }
}





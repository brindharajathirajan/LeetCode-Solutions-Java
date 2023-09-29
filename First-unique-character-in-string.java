class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for(char c:chars){
            freq[c-'a']++;
        }
        for(int i = 0;i<chars.length;i++){
            if(freq[chars[i]-'a'] == 1)
                 return i;
        }
        return -1;
    }
}

// Idea : create a freq array which tracks the frequency of the characters in the given string.
//        loop through the string (character by character) to find the first character whose frequency is 1.

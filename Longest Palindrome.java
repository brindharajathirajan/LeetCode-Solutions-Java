class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];          // considering the ascii values from A-Z and a-z, the size of array is taken as 128
        for(char ch : s.toCharArray()){
            count[ch]++;                     //  notes the frequency of all characters in the given string
        }
        int res = 0;                         // this variable keeps track of the length of palindrome
        for(int i=0;i<128;i++){
            int val = count[i];
            res = res + (val/2)*2;               // this step gives even result even if the value(val) is odd (basically for finding even len palindrome)
            if(res%2 == 0 && val%2 == 1){        // if the res is even and val is odd , the length of the res is incremented
                res++;
            }
        }
        return res;
    }
}

/* Idea: Consider the input string s = "abccccdd" .
         here , a b c d are the characters and their frequencies are 1 1 4 2 respectively.
          we add 4 + 2 ,i.e we consider the characters which are repeated even number of times.This will give us even length palindrome (ccccdd or dccccd etc)
          Since we are interested in finding the longest palindrome ,we consider either character a or b from the string as well. The resulting string will be 
          dccaccd or dccbccd whose length is 7.
          The value 7 is returned.
*/

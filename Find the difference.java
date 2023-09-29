class Solution {
    public char findTheDifference(String s, String t) {
        int total= 0;
        for(int i = 0;i<t.length();i++){
            total += t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            total -= s.charAt(i);
        }
        return (char)total;
    }
}

// Idea : Here the ASCII values of the characters in the string t are added(result saved in total) and are then subtracted from result of addition of ASCII values of 
//        characters in the string s which results in the ascii value of newly added character(which is returned as the output)

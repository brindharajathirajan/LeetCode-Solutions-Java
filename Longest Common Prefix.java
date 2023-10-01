class Solution {
    public String longestCommonPrefix(String[] strs) {
           StringBuilder sb = new StringBuilder();
           Arrays.sort(strs);

           char[] first = strs[0].toCharArray();
           char[] last = strs[strs.length - 1].toCharArray();

           for(int i = 0;i < first.length;i++){
             if(first[i] == last[i]){
               sb.append(first[i]);
             }
             else{
               break;
             }
           }
           return sb.toString();
    }
}


// Idea : On sorting the string array, the words are arranged in dictionary order.
//          Compare the first and the last word from the sorted array for finding similar 
//        characters(common prefix). 




  

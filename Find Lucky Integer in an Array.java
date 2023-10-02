// Problem link - https://leetcode.com/problems/find-lucky-integer-in-an-array/description/

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else{
                map.put(arr[i],1);
            }

        }
        int x = 0;
        int max = -1;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){      // iterating through the elements of hashmap
            if(entry.getKey() == entry.getValue()){
                   x = entry.getValue();
                   max = Math.max(x,max);
            }
        }
        return max;
    }
}

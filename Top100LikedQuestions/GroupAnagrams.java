//https://leetcode.com/problems/group-anagrams/submissions/?envType=study-plan-v2&envId=top-100-liked
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}
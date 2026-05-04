

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            
            int[] count = new int[26]; // new array for each string
            
            // fill frequency
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            
            // convert to string key
            String key = Arrays.toString(count);
            
            // grouping
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

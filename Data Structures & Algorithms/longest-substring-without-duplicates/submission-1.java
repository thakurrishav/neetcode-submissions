
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        HashMap<Character,Integer>map = new HashMap<>();
        int Max = 0;
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char left = s.charAt(l);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                l++;
            }
            Max = Math.max(Max,r-l+1);
        }
        return Max;
    }
}
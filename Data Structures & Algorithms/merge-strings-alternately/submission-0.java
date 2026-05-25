class Solution {
    public String mergeAlternately(String word1, String word2) {
      int i = 0;
      int j = 0;
      int k = 0;
    StringBuilder s3 = new StringBuilder(
        word1.length() + word2.length()
);

    while(i<word1.length() &&  j<word2.length()){
        s3.append(word1.charAt(i));
        i++;
        s3.append(word2.charAt(j));
        j++;
    }
    while(i<word1.length()){
        s3.append(word1.charAt(i));
        i++;
    }
    while(j<word2.length()){
        s3.append(word2.charAt(j));
        j++;
    }
    String ans = s3.toString();
    return ans;
    }
}
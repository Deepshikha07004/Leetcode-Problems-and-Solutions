class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        String merge="";
        int i=0;
        while (i<len1 || i<len2)
        {
            if (i<len1)
                merge=merge+word1.charAt(i);
            if (i<len2)
                merge=merge+word2.charAt(i);
            i++;
        }
        return merge;
        
    }
}
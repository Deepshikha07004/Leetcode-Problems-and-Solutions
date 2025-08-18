class Solution {
    public String mergeAlternately(String word1, String word2) {

        //calculating the letter count for both strings
        int l1 = word1.length();
        int l2 = word2.length();
        //a string variable to store the merged output
        String word3 = "";
        //initializing the loop variable
        int j = 0;
        //merging alternate characters till the shorter length among l1 and l2
        while (j <= (l1 - 1) && j <= (l2 - 1))
        {
            word3 = word3 + word1.charAt(j);
            word3 = word3 + word2.charAt(j);
            j++;
        }
        //merging the remaining characters (if any)
        if (j < l1)
            word3 = word3 + word1.substring(j);
        if (j < l2)
            word3 = word3 + word2.substring(j);
        
        return word3;
        
    }
}
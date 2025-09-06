class Solution {
    int gcdOfLengths(int a, int b)
    {
        if (b==0)
            return a;
        else
            return gcdOfLengths(b, (a%b));
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1.concat(str2).equals(str2.concat(str1))))
            return "";
        int l=gcdOfLengths(str1.length(),str2.length());
        return str1.substring(0,l);
    }
}
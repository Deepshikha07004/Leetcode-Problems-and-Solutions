import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l=candies.length;
        boolean[] result1;
        result1 = new boolean[l];
        List<Boolean> result=new ArrayList<>(l);
        for (int i=0;i<l;i++)
        {
            int candy=candies[i]+extraCandies;
            int flag=1;
            for (int j=0;j<l;j++)
            {
                if (i!=j && candies[j]>candy)
                {
                    flag=0;
                    break;
                }
            }
            if (flag==1)
                result1[i]=true;
            else
                result1[i]=false;

            result.add(result1[i]);
        }
        return result;
    }
}
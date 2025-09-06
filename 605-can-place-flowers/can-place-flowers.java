class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length=flowerbed.length;
        for (int i=0; i<length; i++)
        {
            int left=(i==0)?0:(i-1);
            int right=(i==length-1)?(length-1):(i+1);
            if(flowerbed[left]+flowerbed[i]+flowerbed[right]==0)
            {
                flowerbed[i]=1;
                n--;
            }
        }
        if (n<=0)
            return true;
        return false;
    }
}
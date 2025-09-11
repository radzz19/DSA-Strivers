package SlidingWindow;
// leetcode : 1493
public class subaaray {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int z=0;
        int i=0;int j=0;
        for(int ele:nums){
            if(ele==0)z++;

        }
        if(z==0) return n-1;
        while(i<n && nums[i]==0)i++;
        i=j;
        int maxlen =Integer.MIN_VALUE;
        z=0;
        while(j<n){
            if(nums[j]==1)j++;
            else{
                if(z==0){
                    z=1;
                    j++;
                }
                else{
                    int len=j-i-1;
                    maxlen=Math.max(maxlen,len);
                    j++;
                    while(i<n && nums[i]==1)i++;
                    i++;
                }
            }
        }

    int len =j-i-1;
    maxlen=Math.max(maxlen,len);
    return maxlen;        
    }
    
}


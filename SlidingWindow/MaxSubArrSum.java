package SlidingWindow;
public  class MaxSubArrSum {

    public static int helper(int []arr,int k){
        int n=arr.length;
        if(k>n)return 0;
        int i=0;int j=0;
        int sum=0;
        for( j=0;j<k;j++){
            sum+=arr[j];
        }
        j++;
        int ans=sum;
        
        while(j<n){
             sum+=arr[j]-arr[i];
             ans=Math.max(ans,sum);
            
             i++;
             j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={10,20,1,3,-40,80,10};
        int k=3;
        System.out.println(helper(arr,k));
    }

    
}

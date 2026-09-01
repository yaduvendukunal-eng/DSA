class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int right =0;
        double maxavg =Integer.MIN_VALUE;
        double  sum=0;
        for(int i=0;i<k;i++){
            
                sum+=nums[right];
                right++;
                maxavg=sum;
            
        }
        for(int i=k;i<nums.length;i++){
           
           
             sum+=nums[right];
             sum-=nums[left];
             right++;
             left++;
             maxavg=Math.max(maxavg,sum);
            
        }
        return maxavg/k;
    }
}
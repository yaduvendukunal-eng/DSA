class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length; 

        for(int i=0;i<n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i] = temp;
        
         }

        k= (k % n) ;

        for(int i=0;i<((k)/2);i++){

            int temp = nums[i];

            nums[i]=nums[k-1-i];

            nums[k-1-i]=temp;
        }
        for(int i=k;i<k+(n-k)/2;i++){

            int tmp = nums[i];
            nums[i]=nums[n-1-(i-k)];
            nums[n-1-(i-k)]=tmp;
        }
    }
}
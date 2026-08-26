class Solution {
        public static void rev (int a,int n ,int [] nums ){
            for(int i=a;i<a+(n-a)/2;i++){
                int temp = nums[i];
                nums[i]=nums[n-1-(i-a)];
                nums[n-1-(i-a)]=temp;
            }
        }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(0,nums.length,nums);
        rev(0,k,nums);
        rev(k,nums.length,nums);

    }
}
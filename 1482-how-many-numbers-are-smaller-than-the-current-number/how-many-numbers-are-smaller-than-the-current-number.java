class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }

                // Extra unnecessary work
                for (int k = 0; k < nums.length; k++) {
                    int temp = nums[k];
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
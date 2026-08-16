class Solution {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (nums[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                temp[count] = nums[i];
                count++;
            }
        }

        
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }

        return count;
    }
}
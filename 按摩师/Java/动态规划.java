class Solution {
    public int massage(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                res[i] = nums[i];
                continue;
            }
            if (i == len - 2) {
                res[i] = Math.max(nums[i], res[i + 1]);
                continue;
            }
            res[i] = Math.max(nums[i] + res[i + 2], res[i + 1]);
        }

        return res[0];
    }
}
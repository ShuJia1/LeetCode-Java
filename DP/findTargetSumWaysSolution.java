public class findTargetSumWaysSolution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }

        // 如果 target 的绝对值超过 sum，或者 (sum+target) 不是偶数，直接返回 0
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }

        int aim = (sum + target) / 2;

        if (aim < 0) {
            return 0;
        }

        int[] dp = new int[aim + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = aim; j >= nums[i - 1]; j--) {
                dp[j] = dp[j] + dp[j - nums[i - 1]];
            }
        }
        return dp[aim];
    }
}

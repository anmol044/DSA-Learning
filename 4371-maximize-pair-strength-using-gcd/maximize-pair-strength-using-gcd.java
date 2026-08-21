class Solution {
    public long maxPairStrength(int[] nums) {
       int n = nums.length;
        long best = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long a = nums[i], b = nums[j];
                long g = gcd(a, b);
                long strength = (a * b) / (g * g);
                if (strength > best) best = strength;
            }
        }
        return best;
    }
      private long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}

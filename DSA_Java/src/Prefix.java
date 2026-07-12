public class Prefix {

    private int[] prefix;

    public void PrefixSum(int[] nums) {
        int n = nums.length;
        this.prefix = new int[n];

        if (n > 0) {
            this.prefix[0] = nums[0];
            for (int i = 1; i < n; i++) {
                this.prefix[i] = this.prefix[i - 1] + nums[i];
            }
        }
    }

    public int rangeSum(int left, int right) {
        int sumAtRight = prefix[right];
        int sumBeforeLeft;

        if (left > 0) {
            sumBeforeLeft = prefix[left - 1];
        } else {
            sumBeforeLeft = 0;
        }

        return sumAtRight - sumBeforeLeft;
    }

}

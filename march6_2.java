class Solution {
    public static int MissingNumber(int[] array, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return total - sum;
    }
}

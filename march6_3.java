class Solution {
    public static int print2largest(int arr[], int n) {
        int firstMax = -1, secondMax = -1;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}

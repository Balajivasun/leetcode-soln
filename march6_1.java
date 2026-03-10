class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int target) {
        int start = 0;
        int sum = 0;  
        ArrayList<Integer> result = new ArrayList<>();
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            while (sum > target && start < end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                result.add(start + 1); // 1-based index
                result.add(end + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}

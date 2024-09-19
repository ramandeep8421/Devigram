import java.util.*;

class Solution {
    public boolean isValid(int[] a, int k, long mid) {
        int groups = 0;
        long sum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] > mid) return false;

            if (sum + a[i] > mid) {
                groups++;
                sum = 0;
            }
            sum += a[i];
        }

        if (sum > 0) groups++;

        return groups <= k;
    }

    public long arrayDivision(int[] a, int k) {
        long lo = 0, hi = 0;
        long ans = 0;

        for (int it : a) hi += it;

        while (lo <= hi) {
            long mid = (hi + lo) / 2;

            if (isValid(a, k, mid)) {
                hi = mid - 1;
                ans = mid;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution obj = new Solution();

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(obj.arrayDivision(a, k));
    }
}

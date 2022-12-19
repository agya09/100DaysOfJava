public class centered15Array {
    public static void main(String[] args) {
        int[] a = { 1, 10, 5, 1 };
        int res = centered15(a);
        System.out.println(res);
    }

    public static int centered15(int[] a) {
        int l = 0, r = a.length - 1;
        int sum = 0;
        while (l <= r) {
            for (int i = 1; i <= r; i++) {
                sum += a[i];
            }
            if (sum == 15)
                return 1;
            sum = 0;
            l++;
            r--;
        }
        return 0;
    }
}

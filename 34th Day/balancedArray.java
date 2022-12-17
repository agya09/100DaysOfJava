public class balancedArray {
    public static int minValueToBalance(int a[], int n) {
        int sum1 = 0;
        for (int i = 0; i < n / 2; i++)
            sum1 += a[i];

        int sum2 = 0;
        for (int i = n / 2; i < n; i++)
            sum2 += a[i];

        return Math.abs(sum1 - sum2);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 5, 6, 1, 1 };
        int n = 8;
        System.out.println(minValueToBalance(arr, n));
    }

}

public class base10 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 7 };
        int res = convertToBase10(a, 3);
        System.out.println(res);
    }

    public static int convertToBase10(int a[], int n) {
        int sum = 0;
        int islegal;
        islegal = isLegalNum(a, n);
        if (islegal == 1) {
            for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
                sum += a[i] * Math.pow(n, j);
            }
            return sum;
        }
        return -1;
    }

    public static int isLegalNum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] >= n)
                return 0;
        }
        return 1;
    }

}

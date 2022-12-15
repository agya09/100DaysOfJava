public class bunkerArray {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6, 1 };
        System.out.println(isBunker(a));
    }

    public static int isBunker(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 1) {
                        result = 1;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static Boolean isPrime(int n) {
        boolean isPrimeNum = true;
        if (n <= 0)
            isPrimeNum = false;
        if (n == 1)
            isPrimeNum = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                isPrimeNum = false;
                break;
            }
        }
        return isPrimeNum;
    }
}

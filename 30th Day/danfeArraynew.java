public class danfeArraynew {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        System.out.println(isDanfeArr(a));
    }

    public static int isDanfeArr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] % 2 == 0 && a[i + 1] % 2 != 0))
                return 0;
            else if ((a[i] % 2 != 0 && a[i + 1] % 2 == 0))
                return 0;
        }
        return 1;
    }

}
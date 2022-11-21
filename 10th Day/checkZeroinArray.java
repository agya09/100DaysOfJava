public class checkZeroinArray {
    public static void main(String args[]) {
        int[] a = { 1, 1, 1, 0, 1, 1 };
        int result = arrayHasNOZeros(a);
        System.out.println(result);
    }

    public static int arrayHasNOZeros(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println("Array has zero in it!");
                return 0;

            }
        }
        return 1;
    }
}
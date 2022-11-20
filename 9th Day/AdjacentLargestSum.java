public class AdjacentLargestSum {

    public static void main(String[] args) {
        int a[] = { 10, 15, 20 };
        int result = sum(a);
        System.out.println("The adjacent largest sum is : " + result);

    }

    public static int sum(int[] a) {
        int max = a[0] + a[1];
        for (int i = 1; i < a.length - 1; i++) {
            if ((a[i] + a[i + 1]) > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;

    }
}

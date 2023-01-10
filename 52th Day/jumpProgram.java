public class jumpProgram {

    public static boolean canJump(int[] A) {
        if (A.length <= 1)
            return true;
        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            if (max <= i && A[i] == 0)
                return false;

            if (i + A[i] > max) {
                max = i + A[i];
            }

            if (max >= A.length - 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 5 };
        int[] second = { 0, 2, 4, 6, 1, 3, 0 };

        System.out.println(canJump(first));
        System.out.println(canJump(second));
    }

}

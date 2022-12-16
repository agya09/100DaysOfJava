public class BeanArray {
    public static int isBean(int[] a) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 13) {
                        res = 1;
                        break;
                    } else {
                        res = 0;
                    }
                }
            }
            if (a[i] == 7) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 16) {
                        res = 0;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 7, 13, 16, 20 };
        System.out.println(isBean(a));
    }

}

class medianSortedArray {
    public static void main(String[] args) {
        int[] array1 = { 2, 3, 4, 5, 8 };
        int[] array2 = { 1, 6, 7 };
        System.out.println(Median(array1, array2));
    }

    public static double Median(int[] array1, int[] array2) {
        int x = array1.length;
        int y = array2.length;
        int[] nums = new int[x + y];

        int i = 0, j = 0, k = 0;
        while (i < x && j < y) {
            if (array1[i] < array2[j]) {
                nums[k++] = array1[i++];
            } else {
                nums[k++] = array2[j++];
            }
        }

        while (i < x) {
            nums[k++] = array1[i++];
        }
        while (j < y) {
            nums[k++] = array2[j++];
        }

        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }

    }

}
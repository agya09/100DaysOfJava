public class array {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        arr[3] = 25;
        arr[4] = 30;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is : " + arr[i] + ".");
        }
    }

}

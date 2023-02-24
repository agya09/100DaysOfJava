public class bubbleSort {
    static void bblSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {45,34,55,23,67,86,33,12,90};
        System.out.println("Array Before Bubble Sort");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
        bblSort(arr);
        System.out.println("Array After Bubble Sort");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    
}

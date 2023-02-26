public class selectionSort {
    public static void selection(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int index = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int smallerNum = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNum;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,2,12,3,33,29,93,22,58};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        selection(arr1);
        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    
}

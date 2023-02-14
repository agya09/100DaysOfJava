public class binarySearch {
    public static int binSearch(int arr[], int first, int last, int key){
        if(last>=first){
            int mid = first + (last-first)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                return binSearch(arr, first, mid-1, key);
            }else{
                return binSearch(arr, mid+1, last, key);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25,30,35,40,45,50};
        int key = 35;
        int last = arr.length-1;
        int result = binSearch(arr, 0, last, key);
        if(result==-1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index: "+result);

    }
}

public class BinarySearch {
    public static void main(String[] args) {
//        int []arr = {2,5,4,8,9,1};
        int []arr = {10,20,30,40,50};
        System.out.println(binarySearchRecursive(arr,40,0,arr.length - 1));
    }
    public static int binarySearchIterative(int []arr, int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] > x ){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int []arr, int x, int low, int high){
        if(low >= high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == x){
            return mid;
        } else if(arr[mid] > x){
            return binarySearchRecursive(arr, x, low,high - 1);
        } else {
            return binarySearchRecursive(arr,x,low + 1, high);
        }
    }
}

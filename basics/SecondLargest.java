public class SecondLargest {
    public static void main(String[] args) {
        int []arr = {2,2,2,3};
        System.out.println(findSecondLargestOptimised(arr));
    }
    public static int findSecondLargestOptimised(int []arr){
        int res = -1;
        int largest = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            } else if (res == -1 || arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }
}

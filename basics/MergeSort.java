public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 11, 30};
        sort(arr,0,arr.length - 1);
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
    public static void merge(int a[], int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0 ; i < n1 ; i++){
            left[i] = a[low + i];
        }
        for(int j = 0 ; j < n2 ; j++){
            right[j] = a[mid + j + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                a[k] = left[i];
                i++;
                k++;
            } else {
                a[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            a[k] = left[i];
            i++;
            k++;
        }
        while(i < n1){
            a[k] = right[j];
            j++;
            k++;
        }
//        for(int element: a){
//            System.out.print(element+" ");
//        }
//        System.out.println();
    }
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
//            int m = l + (r - l) / 2;
int m = (r + l)/2;
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {2,5,4,8,9,1};
        System.out.println(linerSearch(arr,9));
    }
    public static int linerSearch(int [] arr, int x){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int []arr = {2,2,5,7,7,9};
        System.out.println(removeDuplicatesOptimised(arr));
        for(int element: arr){
            System.out.print(element+" ");
        }


//        int []temp = new int[arr.length];
//        temp[0] = arr[0];
//        int counter = 0;
//        for(int i = 1 ; i < arr.length ; i++){
//            if(arr[i] != temp[counter]){
//                counter++;
//                temp[counter] = arr[i];
//            }
//        }
//        for (int element: temp){
//            System.out.print(element+" ");
    }

    public static int removeDuplicatesOptimised(int []arr){
        int res = 1;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] != arr[res - 1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

}

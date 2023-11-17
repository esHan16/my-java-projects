import java.util.Arrays;
public class ArrayMerge {
    public static void main(String[] args) {
        int a[] = {10, 15, 20};
        int b[] = {5, 6, 6, 15};
//        mergeNaive(a,b);
        mergeEfficient(a,b);
    }
    public static void mergeNaive(int []a , int []b){
        int c[] = new int[a.length + b.length];
        for(int i = 0 ; i < a.length ; i++){
            c[i] = a[i];
        }
        for(int i = 0 ; i < b.length ; i++){
            c[i + a.length] = b[i];
        }
        Arrays.sort(c);
        for(int i : c){
            System.out.print(i+" ");
        }
    }
    public static void mergeEfficient(int a[], int b[]){
        int i = 0 , j = 0;
        int index = 0;
        int c[] = new int[a.length + b.length];
        while (i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[index] = a[i];
                index++;
//                System.out.print(a[i]+" ");
                i++;
            } else {
                c[index] = b[j];
                index++;
//                System.out.print(b[j]+" ");
                j++;
            }
        }
        while (i < a.length){
            c[index] = a[i];
            index++;
//            System.out.print(a[i]+" ");
            i++;
        }
        while (j < b.length){
            c[index] = b[j];
            index++;
//            System.out.print(b[j]+" ");
            j++;
        }
        for(int element : c){
            System.out.print(element+" ");
        }
    }
}

// Pattern Printing Programs
import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern7(n);
    }
    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    public static void pattern1(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j  = 1 ; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void pattern2(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
             *
           * *
         * * *
       * * * *
     * * * * *
     */
    public static void pattern3(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
             *
           * * *
         * * * * *
       * * * * * * *
     * * * * * * * * *
     */
    public static void pattern4(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= (2 * i - 1) ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     * * * * *
     *       *
     *       *
     *       *
     * * * * *
     */
    public static void pattern5(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*
     *                 *
     * *             * *
     * * *         * * *
     * * * *     * * * *
     * * * * * * * * * *
     */
    public static void pattern6(int n){
        for(int i = 1 ; i <= n ; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(int k = 1 ; k <= 2 * (n - i) ; k++){
                System.out.print("  ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     *               *
     * *           * *
     * * *       * * *
     * * * *   * * * *
     * * * * * * * * *
     */
    public static void pattern7(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= (2 * n - 1) ; j++){
                if(i >= j){
                    System.out.print("* ");
                } else if(j < (2 * n - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}


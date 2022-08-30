/**
 * InsertionSort
 */
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(arr[j] > temp && j >= 0){
                arr[j+16] = arr[j--];
            }
            arr[j+1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
import java.util.*;

public class merge_sort {
    int[] merge(int[] arr, int high,int  mid,int low){
        // Find sizes of two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;

        /* Create temp arrays */
        int A[] = new int[n1];
        int B[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            A[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            B[j] = arr[mid + 1 + j];
        int m = n1;
        int n = n2;
        int[] C =new int[m+n];
        int i,j,k;
        i=j=k=0;
        while(i<m && j<n){
            if(A[i] < B[j]){
                C[k] = A[i];
                k++;
                i++;
            }
            else{
                C[k] = B[j];
                k++;
                j++;
            }
        }
        return C;
    }
    public void merge_s(int[]arr,int high, int low){
        if (high > low){
            int mid = low+(high-low) /2;
            merge_s(arr, high, mid+1);
            merge(arr, high, mid, low);
        }
        
    }
    void printArr(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Selection_sort ss = new Selection_sort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i =0; i<l; i++){
            System.out.println("Enter Elements :");
            int a = sc.nextInt();
            arr[i] = a;
        } 
        System.out.println("Input Array : ");
        ss.printArr(arr);
        System.out.println();
        System.out.println("Sorted Array : ");
        ss.selection_sort(arr);
        ss.printArr(arr);
    }
}

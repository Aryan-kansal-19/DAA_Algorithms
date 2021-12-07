import java.util.*;

public class Binary_search {
    public int binary_search(int[] arr,int n,int low,int high){
        int mid = high-low/2;
        if (arr[mid] == n){  return mid;}
        if ( arr[mid] > n){ return binary_search(arr, n, low, mid-1);}
        else { return binary_search(arr, n, mid+1, high);}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i =0; i<l; i++){
            System.out.println("Enter Elements :");
            int a = sc.nextInt();
            arr[i] = a;
        } 
        System.out.println("Enter number to br found");
        int n = sc.nextInt();
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Binary_search bs = new Binary_search();
        System.out.println("Position of the Element : ");
        System.out.println(bs.binary_search(arr, n, 0, arr.length-1));
    }
    
}

import java.util.*;
public class Selection_sort {
    public void selection_sort(int[] arr){
        for( int i = 0 ; i < arr.length-1;i++){
            int min = i;
            for (int j = i+1 ; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

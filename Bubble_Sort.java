import java.util.*;

public class Bubble_Sort{
    public void bubble_sort(int[] arr){
        for(int k = 0; k <arr.length ; k++){
            for(int i = 1; i < arr.length-k; i++){
            if(arr[i-1] > arr[i]){
                int tmp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = tmp;
                }
            }
            Bubble_Sort bb = new Bubble_Sort();
            System.out.println("Array after every Pass :");
            bb.printArr(arr);
            System.out.println();
        }
    }
    void printArr(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Bubble_Sort bb_s = new Bubble_Sort();
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
        bb_s.printArr(arr);
        System.out.println();
        
        bb_s.bubble_sort(arr);

        System.out.println("Sorted Array : ");
        bb_s.printArr(arr);
    }
}
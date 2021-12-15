import java.util.*;


public class Counting_sort{
    public int[] count_sort(int[] arr){
        int[] output = new int[arr.length];

        
        int max = Arrays.stream(arr).max().getAsInt();
        int range = max + 1;
        int[] count = new int[range];

        for (int i = 0; i < count.length; i++){
            count[i] = 0;
        }

        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        for (int j = 1; j < count.length; j++){
            count[j] = count[j-1] + count[j];
        }
        for (int k = 0; k < output.length; k++){
            output[count[arr[k]]-1] = arr[k];
            count[arr[k]]--;
        }

        return output;
    }
    void printArr(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Counting_sort cs = new Counting_sort();
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
        cs.printArr(arr);
        System.out.println();
        
        arr = cs.count_sort(arr);

        System.out.println("Sorted Array : ");
        cs.printArr(arr);
    }
}
import java.util.Scanner;

public class Linear_search {

    public int linear_search(int[] arr, int n){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
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
        Linear_search ls = new Linear_search();
        System.out.println("Position of the Element : ");
        System.out.println(ls.linear_search(arr, n));
    } 
    
}

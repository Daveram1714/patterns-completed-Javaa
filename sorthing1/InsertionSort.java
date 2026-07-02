
import java.util.Scanner;

class InsertionSort {
    

    void insertionSor(int n , int[] arr){

        for (int i = 0; i < n; i++) {
                int j = i ;
                while (j>0 && arr[j-1] > arr[j]) { 
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        j--;
                }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the element");
        int n = sc.nextInt();
        System.out.println("Enter the Array of elements : ");
        int [] arr  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort obj = new InsertionSort();

        obj.insertionSor(n, arr);


        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

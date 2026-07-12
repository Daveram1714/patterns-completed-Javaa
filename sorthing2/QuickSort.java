
import java.util.Scanner;

public class QuickSort {
    


    public int partition(int arr[],int low,int high){
        int pivot  = arr[low];
        int i = low;
        int j = high;
        while (i < j) { 
            while (arr[i] <= pivot && i <=  high-1) { 
                i++;
            }
            while (arr[j] > pivot && j>= low+1) { 
                j-- ;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return  j;
    }


        public void sort(int arr[],int low,int high){
            if(low <high){
                int pIndex = partition(arr, low, high);
                sort(arr, low,pIndex - 1);
                sort(arr, pIndex+1, high); 
            }
        }


    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort qs = new QuickSort();

        qs.sort(arr,0, n-1);

        for (int  elem :arr) {
             System.out.println(elem);
        }

    }
}

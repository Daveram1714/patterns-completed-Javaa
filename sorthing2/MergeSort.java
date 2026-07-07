
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MergeSort {

    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);

        }

        while (right <= high) {
            temp.add(arr[right++]);

        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mind = (low + high) / 2;
        mergeSort(arr, low, mind);
        mergeSort(arr, mind + 1, high);
        merge(arr, low, mind, high);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Szie of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, 0,n-1 );
        for (int num : arr) {
            System.out.print(num + " ");
            System.out.println();
        }
    }

}

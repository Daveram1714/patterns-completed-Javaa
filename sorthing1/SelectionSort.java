
import java.util.Scanner;

class SelectionSort {

    public void sor(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }

            }

            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort obj = new SelectionSort();
        System.out.println("The Sorted Array");
        obj.sor(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
